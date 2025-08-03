package recursion_problems;

public class towerOfHanoi {
    public static void hanoiSolver(int n ,char source ,char heler,char destination){
        if(n==1){
            System.out.println("Move disc1 from "+source+" to "+destination);
            return;
        }
        hanoiSolver(n-1,source,destination,heler);
        System.out.println("Move disc "+n+" from "+source+" to "+destination);
        hanoiSolver(n-1,heler,source,destination);
    }

    public static void main(String[] args) {
        int n=3;
        hanoiSolver(n,'A', 'B', 'C');
    }
}
