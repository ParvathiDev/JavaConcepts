package Exception;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        //int a = Integer.parseInt(null); //throws Exception as     //the input string is of illegal format for parsing as it is null.
        int a = 12;
        int b = Integer.parseInt("uu");
        System.out.println(a + " "+ b);

    }
}
