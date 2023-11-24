public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Engine Blade");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        this.healthPercentage = (health <= 0) ? 1 : (health > 100) ? 100 : health;
        this.weapon = weapon;
    }


    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) System.out.println("Player Knocked Out");
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Health 100%");
            healthPercentage = 100;
        }
    }

}
