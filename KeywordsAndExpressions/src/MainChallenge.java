public class MainChallenge {
    /* Challenge */
//    public static void main(String[] args) {
//        System.out.println(displayHighScorePosition("Asuka", calcHighScorePosition(1500)));
//        System.out.println(displayHighScorePosition("Rei", calcHighScorePosition(1000)));
//        System.out.println(displayHighScorePosition("Shinji", calcHighScorePosition(500)));
//        System.out.println(displayHighScorePosition("Mari", calcHighScorePosition(100)));
//    }
//
//    public static int calcHighScorePosition(int score) {
//        return score >= 1000 ? 1 : score >= 500 ? 2 : score >= 100 ? 3 : 4;
//    }
//
//    public static String displayHighScorePosition(String playerName, int playerPosition) {
//        return playerName + " managed to get into position " + playerPosition + " on the score list";
//    }
    public static void checkNumber(int number) {
        System.out.println(number > 0 ? "positive" : number < 0 ? "negative" : "zero");
    }
}
