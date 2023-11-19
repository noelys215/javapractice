public class MainChallenge {
    public static void main(String[] args) {
        Account shinjisAccount =
                new Account("12345", 500.00, "Shinji Ikari", "shinji@nerv.net", "555-555-5555");

        System.out.println(shinjisAccount.getNumber());
        System.out.println(shinjisAccount.getBalance());

        shinjisAccount.withdrawFunds(100.00);
        shinjisAccount.depositFunds(250.00);
        shinjisAccount.withdrawFunds(50.00);
        shinjisAccount.withdrawFunds(200);

        Account asukasAccount = new Account("Asuka", "asuka@nerv.net", "666-666-6666");

        System.out.println("AccountNo: " + asukasAccount.getNumber() + "; Name: " + asukasAccount.getCustomerName());
    }
}
