public class Main {
    public static void main(String[] args) {
        Employee asuka = new Employee("Asuka", "12/05/2005", "01/02/2021");
        System.out.println(asuka);
        System.out.println("Age: " + asuka.getAge());
        System.out.println("Pay: " + asuka.collectPay());

        SalariedEmployee rei = new SalariedEmployee("Rei", "11/15/2004", "01/02/2020", 45000);
        System.out.println(rei);
        System.out.println("Rei's Pay: $" + rei.collectPay());

        rei.retire();
        System.out.println("Rei's Pension: $" + rei.collectPay());

        HourlyEmployee mari = new HourlyEmployee("Mari", "04/06/2000", "01/02/2010", 45);
        System.out.println(mari);
        System.out.println("Mari's Pay: $" + mari.collectPay());
        System.out.println("Mari's Holiday Pay: $" + mari.getDoublePay());
    }


}