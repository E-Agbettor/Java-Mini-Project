package com.classes;

import java.util.ArrayList;

public class Branch {
    //member fields
    private String branchName;
    private ArrayList<Customer>customers;

    //constructor
    public Branch(String name) {
        this.branchName = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(Customer customer, double initial_transaction) {
        if (findCustomer(customer.getName(name)) >= 0) {
            System.out.println("Customer is already on file. Try again!");
            return false;
        }
        customers.add(customer);
        double initial_amount = initial_transaction;
        customer.getTransactions().add(initial_amount);
        return true;
    }

    public boolean addCustomerTransaction(Customer customer, double transaction){

    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
