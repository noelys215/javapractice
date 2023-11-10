public class Main {

    public static void main(String[] args) {

        char charVal = 'Z';
        switch (charVal) {
            case ('A'):
                System.out.println("A is able");
                break;
            case ('B'):
                System.out.println("B is baker");
                break;
            case ('C'):
                System.out.println("C is charlie");
                break;
            case ('D'):
                System.out.println("D is dog");
                break;
            case ('E'):
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charVal + " was not found in statement.");
                break;
        }

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                yield month + " is invalid.";
            }
        };
    }

}
