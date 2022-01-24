package polymorphism;// Java Program for Method Overriding

// Class 1
// polymorphism.Helper class
class Parent {

    // Method of parent class
    void Print()
    {

        // Print statement
        System.out.println("parent class");
    }
}

// Class 2
// polymorphism.Helper class
class subclass1 extends Parent {

    // Method
    void Print() { System.out.println("polymorphism.subclass1"); }
}

// Class 3
// polymorphism.Helper class
class subclass2 extends Parent {

    // Method
    void Print()
    {

        // Print statement
        System.out.println("polymorphism.subclass2");
    }
}

// Class 4
// Main class
class TestOverriding {

    // Main driver method
    public static void main(String[] args)
    {

       /* // Creating object of class 1
        polymorphism.Parent a;

        // Now we will be calling print methods
        // inside main() method

        a = new polymorphism.subclass1();
        a.Print();

        a = new polymorphism.subclass2();
        a.Print();*/

       /* polymorphism.Parent x = new polymorphism.Parent();
        polymorphism.subclass1 y = new polymorphism.subclass1();
        polymorphism.subclass2 z = new polymorphism.subclass2();

        x.Print();
        y.Print();
        z.Print();
*/

        // Child Object polymorphism.Parent reference ki assign
      /*  polymorphism.Parent parentReference = new polymorphism.subclass2();
        parentReference.Print();*/

        // polymorphism.Parent Object child reference ki assign

       /*   polymorphism.subclass1 childReference = (polymorphism.subclass1) new polymorphism.Parent();
        childReference.Print();*/

        // Can we cast child to polymorphism.Parent
        Parent parentReference = new subclass2();
        parentReference.Print();



 }
}
