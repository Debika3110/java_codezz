public class Remove_Consecutive_Duplicate_Characters_usingRecursion {
    static String duplicate(String str){
        if(str.length()<=1) return str;
        if(str.charAt(0)==str.charAt(1)){
            return duplicate(str.substring(1));
        }else{
            return str.charAt(0)+duplicate(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String input = "aabbccdee";
        System.out.println(duplicate(input)); // Output: abcde
    }
}
