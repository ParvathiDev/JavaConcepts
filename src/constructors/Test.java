package constructors;

public class Test {
    Test(){
        System.out.println("I am from Constructor");
    }
    Test(int x){
        System.out.println("Parameter :"+ x);
    }

   public void m1(){
        System.out.println("I am from m1");
    }

    public static void main(String[] args){
        Test t = new Test(10); //instance creation
        t.m1();
    }

}
