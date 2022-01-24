package String;

public class Palindrome {

    private static boolean isPalindromeString(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length(); //3
        System.out.println(length / 2); //1
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[]args){
        boolean flag = Palindrome.isPalindromeString("venkatesh");
        if(flag==true){
            System.out.println("Given String is a palindrome");
        }
        else{
            System.out.println("Given String is not a palindrome");
        }
    }


}
