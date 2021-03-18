package com.interfaces;

import java.util.ArrayList;

public interface Branch {
    public String getName();
    public ArrayList<Customer> getCustomers();
    public boolean newCustomer();
    public boolean addCustomerTransaction();
    public Customer findCustomer();
}
