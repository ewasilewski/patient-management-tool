package org.pmt.web;

import java.util.List;

/**
 * Interface
 */
public interface CustomerDao {

    public void createCustomer(Customer customer);
    public Customer readCustomer(int id);
    public List<Customer> readAll();
    public void updateCustomer(Customer customer);
    public void deleteCustomer(int id);
    public void deleteAll();

}
