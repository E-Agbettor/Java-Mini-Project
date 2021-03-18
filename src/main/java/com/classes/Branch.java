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

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer !=null){
            existingCustomer.addTransaction(transaction);
            return  true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
