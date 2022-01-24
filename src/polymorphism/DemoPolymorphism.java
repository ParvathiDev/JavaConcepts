package polymorphism;

public class DemoPolymorphism {
    public void shape(){
        System.out.println("I am having no shape");
    }
    public void shape(String input){
        System.out.println("I am having "+input+" shape");
    }
    public static void main(String[]args){
        DemoPolymorphism demoPolymorphism = new DemoPolymorphism();
        demoPolymorphism.shape();
        demoPolymorphism.shape("Traingle");
    }
}
