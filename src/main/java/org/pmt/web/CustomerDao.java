package org.pmt.web;

import java.util.List;

/**
 * Interface
 */
public interface CustomerDao {

    public void create(Customer customer);
    public Customer read(int id);
    public List<Customer> readAll();
    public void update(Customer customer);
    public void delete(int id);
    public void deleteAll();

}
