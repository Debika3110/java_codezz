import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class arraySum {
    /*
    Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]

Explanation :
Here,   [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)

     */
    public static void main(String[] args) {
        List<Integer> input=List.of(1,2,3,4,5);
        List<List<Integer>> pyramid=generate(input);
        for(List<Integer> row: pyramid){
            System.out.println(row);
        }
        reverse();
        reverse1();
    }
    public static List<List<Integer>> generate(List<Integer> input){
        List<List<Integer>> pyramid=new ArrayList<>();
        List<Integer> current=new ArrayList<>(input);
        while(!current.isEmpty()){
            pyramid.add(new ArrayList<>(current));
            current=nextlevel(current);
        }
        return pyramid;
    }
    public static List<Integer> nextlevel(List<Integer> current){
        List<Integer> next=new ArrayList<>();
        for(int i=0;i<current.size()-1;i++){
            int sum=current.get(i)+ current.get(i+1);
            next.add(sum);
        }
        return next;
    }
    ////////////////////////////print in reverse orer/////////////////////////////
    public static void reverse(){
        List<Integer> input=List.of(1,2,3,4,5);
        List<List<Integer>> pyramid=generate(input);
        Collections.reverse(pyramid);
        System.out.println();
        for(List<Integer> row: pyramid){
            System.out.println(row);
        }
    }
    public static void reverse1(){
        List<Integer> input=List.of(1,2,3,4,5);
        List<List<Integer>> pyramid=generate(input);

        System.out.println();
        for(int i=pyramid.size()-1;i>=0;i--){
            System.out.println(pyramid.get(i));
        }
    }
}
