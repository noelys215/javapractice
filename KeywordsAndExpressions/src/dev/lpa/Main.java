package dev.lpa;

import java.util.ArrayList;
import java.util.Optional;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>());
        transactions.add(initialDeposit);
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Optional<Customer> getCustomer(String customerName) {
        return customers.stream()
                .filter(customer -> customer.name().equalsIgnoreCase(customerName))
                .findFirst();
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName).isEmpty()) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        } else {
            System.out.printf("Customer (%s) already exists%n", customerName);
        }
    }

    public void addTransaction(String name, double transactionAmount) {
        getCustomer(name).ifPresent(customer -> customer.transactions().add(transactionAmount));
    }

    public void printStatement(String customerName) {
        Optional<Customer> customer = getCustomer(customerName);
        if (customer.isPresent()) {
            System.out.println("_".repeat(30));
            System.out.println("Customer Name: " + customer.get().name());
            System.out.println("Transactions:");
            for (double d : customer.get().transactions()) {
                System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
            }
        } else {
            System.out.printf("Customer (%s) not found %n", customerName);
        }
    }
}

public class Main {
    public static void main(String... args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Asuka", 500.0);
        System.out.println(bank);

        bank.addTransaction("Asuka", -10.24);
        bank.addTransaction("Asuka", -75.01);
        bank.printStatement("Asuka");

        bank.addNewCustomer("Mari", 25);
        bank.addTransaction("Mari", 1024);
        bank.printStatement("Mari");
    }
}

