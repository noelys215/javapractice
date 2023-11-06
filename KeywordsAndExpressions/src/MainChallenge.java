public class MainChallenge {
    public static void main(String[] args) {
        calcScore(true, 800, 5, 100);
    }

    //METHOD
    public static void calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Final Score: " + finalScore);
        }
    }
}
