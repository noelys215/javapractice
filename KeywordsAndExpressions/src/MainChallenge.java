public class MainChallenge {
    public static String getDurationString(int seconds) {
        return seconds < 0 ? "Invalid value" : getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            return "Invalid value";
        }
        return String.format("%02dh %02dm %02ds", minutes / 60, minutes % 60, seconds);
    }


    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45)); // should return "01h 05m 45s"
        System.out.println(getDurationString(3945));   // should return "01h 05m 45s"
        System.out.println(getDurationString(61, 0));  // should return "01h 01m 00s"
        System.out.println(getDurationString(3600));   // should return "01h 00m 00s"
    }

}
