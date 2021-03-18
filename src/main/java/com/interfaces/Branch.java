package com.interfaces;

public interface Branch {
    public boolean newCustomer(String customerName, double initialTransaction);
    public boolean addCustomerTransaction(String customerName, double transaction);
    public com.classes.Customer findCustomer(String customerName);
}
