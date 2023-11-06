public class MainChallenge {
    public static void main(String[] args) {
        int highScore = calcScore(true, 800, 5, 100);

        System.out.println("1st High Score: " + highScore);
        System.out.println("2nd High Score: " + calcScore(true, 10_000, 8, 200));
    }

    /* METHOD */
    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

}
