public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
    }

    public static void printInformation(String string) {
        System.out.println("String: " + string);
        System.out.println("Length: " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder: " + builder);
        System.out.println("Length: " + builder.length());
    }
}