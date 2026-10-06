class StaticDemo {

   
    static void display() {
        System.out.println("This is a static method.");
    }


    void show() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {

     
        StaticDemo.display();
        
        StaticDemo obj = new StaticDemo();
        obj.show();
    }
}