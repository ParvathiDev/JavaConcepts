package TopInterviewProgrammes;

public class OnString {
    public static void main(String[] args){
       /* String string="parvathi";
        String reverse =new StringBuffer(string).reverse().toString();
        System.out.println("String before reverse: " +string);
        System.out.println("String after reverse:"+reverse);*/
  String str ="Parvathi";
  String rev="";
  char[] chars =str.toCharArray();
  for(int i =chars.length -1;i>=0;i-- ){
      rev=rev+chars[i];

  }
  System.out.println(rev);


    }



}
