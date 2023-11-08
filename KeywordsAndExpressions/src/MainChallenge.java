public class MainChallenge {
    public static double convertToCent(int inches) {
        return inches * 2.54;
    }

    public static double convertToCent(int feet, int inches) {
        return (feet >= 0 && inches >= 0 && inches < 12) ? convertToCent(feet * 12 + inches) : -1;
    }


    public static void main(String[] args) {
        System.out.println(convertToCent(68)); // Convert 68 inches to centimeters
        System.out.println(convertToCent(5, 8)); // Convert 5 feet 8 inches to centimeters
    }

}
