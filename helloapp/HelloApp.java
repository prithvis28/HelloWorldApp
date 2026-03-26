package helloapp;

public class HelloApp {
    public static void main(String[] args) {
        String name = "World"; // Default message
        if (args.length > 0) {
            name = args[0]; // Command-line argument overrides default
        }
        System.out.println("Hello " + name);
    }
}
