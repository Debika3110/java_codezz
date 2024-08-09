import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Quiz {

    class Question {
        String question;
        String[] options;
        int correctAnswer;

        public Question(String question, String[] options, int correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    class QuizFrame extends JFrame implements ActionListener {
        private List<Question> questions;
        private int currentQuestionIndex = 0;
        private int score = 0;
        private int timeLeft = 20; // seconds per question

        private JPanel startPanel;
        private JPanel quizPanel;
        private JLabel questionLabel;
        private JRadioButton[] optionsButtons;
        private JButton nextButton;
        private JButton startButton;
        private JLabel timerLabel;

        private Timer timer;

        public QuizFrame() {
            // Initialize the questions
            questions = new ArrayList<>();
            questions.add(new Question("What does CPU stand for?", new String[]{"Central Process Unit", "Central Processing Unit", "Computer Personal Unit", "Central Processor Unit"}, 1));
            questions.add(new Question("What is RAM?", new String[]{"Random Access Memory", "Read Access Memory", "Readily Available Memory", "Randomly Assigned Memory"}, 0));
            questions.add(new Question("What is the primary function of the GPU?", new String[]{"Memory management", "Sound processing", "Graphical rendering", "Data storage"}, 2));
            questions.add(new Question("Which of the following is a type of non-volatile memory?", new String[]{"RAM", "ROM", "Cache", "Registers"}, 1));
            questions.add(new Question("What does SSD stand for?", new String[]{"Solid State Drive", "Super Speed Drive", "Solid Speed Disk", "Silent State Drive"}, 0));
            questions.add(new Question("Which component is responsible for executing instructions?", new String[]{"Motherboard", "CPU", "RAM", "Hard Disk"}, 1));
            questions.add(new Question("What is the purpose of a heatsink?", new String[]{"To store data", "To cool the CPU", "To power the computer", "To increase processing speed"}, 1));
            questions.add(new Question("Which type of cable is used for connecting monitors?", new String[]{"HDMI", "Ethernet", "USB", "SATA"}, 0));
            questions.add(new Question("What is a motherboard?", new String[]{"The main circuit board", "A type of RAM", "A storage device", "A graphics card"}, 0));
            questions.add(new Question("Which component is used for temporary data storage?", new String[]{"Hard Drive", "RAM", "SSD", "GPU"}, 1));
            questions.add(new Question("Which of the following is a peripheral device?", new String[]{"CPU", "RAM", "Mouse", "Motherboard"}, 2));
            questions.add(new Question("What is the function of the power supply unit?", new String[]{"To process data", "To supply power", "To cool the system", "To store data"}, 1));
            questions.add(new Question("Which of the following is an input device?", new String[]{"Monitor", "Printer", "Keyboard", "Speakers"}, 2));
            questions.add(new Question("What is the main function of the BIOS?", new String[]{"Manage graphics", "Manage memory", "Boot the operating system", "Control input devices"}, 2));
            questions.add(new Question("What does the acronym USB stand for?", new String[]{"Universal Serial Bus", "Universal System Bus", "Unified Serial Bus", "Universal Signal Bus"}, 0));
            questions.add(new Question("Which storage device has no moving parts?", new String[]{"HDD", "Floppy Disk", "SSD", "CD-ROM"}, 2));
            questions.add(new Question("What is overclocking?", new String[]{"Increasing the CPU's speed", "Reducing the GPU's power", "Increasing the monitor's refresh rate", "Decreasing RAM speed"}, 0));
            questions.add(new Question("Which of the following is used to connect a computer to a network?", new String[]{"GPU", "NIC", "PSU", "CPU"}, 1));
            questions.add(new Question("What is the function of a cache memory?", new String[]{"Store large files", "Increase CPU speed", "Temporary data storage", "Reduce processing time"}, 3));
            questions.add(new Question("Which of these is a volatile memory?", new String[]{"ROM", "SSD", "RAM", "BIOS"}, 2));

            // Set up the GUI components
            setTitle("Quiz Application");
            setSize(600, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new CardLayout());

            // Start Panel with Rules
            startPanel = new JPanel(new BorderLayout());
            JLabel rulesLabel = new JLabel("<html><h2>Quiz Rules:</h2><ul><li>20 questions about computer hardware.</li><li>You have 20 seconds per question.</li><li>Select the correct answer and press 'Next'.</li><li>Your score will be shown at the end.</li></ul></html>");
            startPanel.add(rulesLabel, BorderLayout.CENTER);

            startButton = new JButton("Start Quiz");
            startButton.addActionListener(this);
            startPanel.add(startButton, BorderLayout.SOUTH);
            add(startPanel, "Start Panel");

            // Quiz Panel
            quizPanel = new JPanel(new BorderLayout());

            questionLabel = new JLabel();
            quizPanel.add(questionLabel, BorderLayout.NORTH);

            JPanel optionsPanel = new JPanel();
            optionsPanel.setLayout(new GridLayout(4, 1));
            optionsButtons = new JRadioButton[4];
            ButtonGroup group = new ButtonGroup();
            for (int i = 0; i < 4; i++) {
                optionsButtons[i] = new JRadioButton();
                group.add(optionsButtons[i]);
                optionsPanel.add(optionsButtons[i]);
            }
            quizPanel.add(optionsPanel, BorderLayout.CENTER);

            nextButton = new JButton("Next");
            nextButton.addActionListener(this);
            quizPanel.add(nextButton, BorderLayout.SOUTH);

            timerLabel = new JLabel("Time left: " + timeLeft + " seconds", SwingConstants.CENTER);
            quizPanel.add(timerLabel, BorderLayout.EAST);
            add(quizPanel, "Quiz Panel");

            ((CardLayout) getContentPane().getLayout()).show(getContentPane(), "Start Panel");
        }

        private void loadNextQuestion() {
            if (currentQuestionIndex < questions.size()) {
                Question currentQuestion = questions.get(currentQuestionIndex);
                questionLabel.setText(currentQuestion.question);
                for (int i = 0; i < optionsButtons.length; i++) {
                    optionsButtons[i].setText(currentQuestion.options[i]);
                    optionsButtons[i].setSelected(false);
                }
                timeLeft = 20;
                timerLabel.setText("Time left: " + timeLeft + " seconds");
                if (timer == null || !timer.isRunning()) {
                    timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            timeLeft--;
                            timerLabel.setText("Time left: " + timeLeft + " seconds");

                            if (timeLeft <= 0) {
                                loadNextQuestion();
                            }
                        }
                    });
                    timer.start();
                }
            } else {
                // Quiz is finished
                if (timer != null) timer.stop();
                JOptionPane.showMessageDialog(this, "Quiz finished! Your score is: " + score + "/" + questions.size());
                System.exit(0);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == startButton) {
                // Start the quiz
                ((CardLayout) getContentPane().getLayout()).show(getContentPane(), "Quiz Panel");
                loadNextQuestion();
            } else if (e.getSource() == nextButton) {
                checkAnswer();
                currentQuestionIndex++;
                loadNextQuestion();
            }
        }

        private void checkAnswer() {
            Question currentQuestion = questions.get(currentQuestionIndex);
            for (int i = 0; i < optionsButtons.length; i++) {
                if (optionsButtons[i].isSelected() && i == currentQuestion.correctAnswer) {
                    score++;
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Quiz quiz = new Quiz();
            QuizFrame quizFrame = quiz.new QuizFrame();  // Create an instance of QuizFrame
            quizFrame.setVisible(true);
        });
    }
}
