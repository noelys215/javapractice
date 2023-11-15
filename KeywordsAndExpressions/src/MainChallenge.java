public class MainChallenge {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int totalKilosFromBigBags = bigCount * 5;
        // Use as many big bags as possible without exceeding the goal
        int bigBagsUsed = Math.min(goal / 5, bigCount);
        // Calculate remaining kilos needed after using big bags
        int remainingKilos = goal - bigBagsUsed * 5;
        // Check if remaining kilos can be fulfilled with small bags
        return smallCount >= remainingKilos;
    }

}
