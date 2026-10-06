class single_thread{
    public static void main(String[] args) {

        System.out.println("Task 1 started");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1: " + i);
        }

        System.out.println("Task 2 started");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2: " + i);
        }

        System.out.println("Program completed");
    }
}