public class MainChallenge {
    public static void main(String[] args) {
        Account shinjisAccount = new Account();
        shinjisAccount.withdrawFunds(100.00);
        shinjisAccount.depositFunds(250.00);
        shinjisAccount.withdrawFunds(50.00);

        shinjisAccount.withdrawFunds(200);
    }
}
