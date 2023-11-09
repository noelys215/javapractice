public class MainChallenge {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.printf("%01d min = %01d y and %01d d", minutes, minutes / 525600, (minutes / 1440) % 365);
        }
    }


    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

}
