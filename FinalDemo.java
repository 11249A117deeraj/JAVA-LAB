class Parent {


    final int VALUE = 100;


    final void display() {
        System.out.println("This is a final method.");
        System.out.println("Final variable value = " + VALUE);
    }
}
final class FinalClass {

    void show() {
        System.out.println("This is a final class.");
    }
}

public class FinalDemo {

    public static void main(String[] args) {

    
        Parent p = new Parent();

        p.display();

        
        FinalClass f = new FinalClass();

  
        f.show();

        
    }
}