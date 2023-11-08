public class Main {
    public static void main(String[] args) {
        int newScore = calcScore("Asuka", 500);
        System.out.println("New score is " + newScore);
    }

    public static int calcScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calcScore(int score) {
        System.out.println("Unknown " + " scored " + score + " points.");
        return score * 1000;
    }

}
