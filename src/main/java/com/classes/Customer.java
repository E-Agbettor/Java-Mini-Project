package com.classes;

import java.util.ArrayList;

public class Customer {
    //member fields
    private String customerName;
    private ArrayList<Double>transactions;

    //constructor
    public Customer(String name, double initialTtransaction) {
        this.customerName = name;
        transactions = new ArrayList<Double>();
        addTransaction(initialTtransaction);
    }
    //getters

    public String getName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }
}
