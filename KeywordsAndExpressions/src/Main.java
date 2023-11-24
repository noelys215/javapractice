public class Main {
    public static void main(String[] args) {
        /*
        Player player = new Player();
        player.fullName = "Asuka Langley";
        player.health = 20;
        player.weapon = "Rail Gun";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health: " + player.healthRemaining());
        player.health = 200;
        player.loseHealth(11);
        System.out.println("Remaining Health: " + player.healthRemaining());
        */

        EnhancedPlayer mari = new EnhancedPlayer("Mari", 200, "Katana");
        System.out.println("Initial Health: " + mari.healthRemaining());

    }
}