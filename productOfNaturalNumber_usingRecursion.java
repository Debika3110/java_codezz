public class productOfNaturalNumber_usingRecursion {
    public static int naturalNumber(int num){
        if(num==1) return num;
        return num*naturalNumber(num-1);
    }
    public static void main(String[]args){
        int num =4;
        System.out.println("The product of the natural number "+num+" = "+naturalNumber(num));
    }
}
