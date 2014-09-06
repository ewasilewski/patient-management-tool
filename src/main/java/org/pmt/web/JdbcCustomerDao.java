package org.pmt.web;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.util.List;

public class JdbcCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    /**
     * Creates a customer in the database
     * */
    public void create(Customer customer) {
        String sql = "INSERT INTO CUSTOMER " +
                "(firstname, lastname, age) VALUES (?, ?,?)";
        jdbcTemplate.update(sql, new Object[] {
                customer.getFirstname(),
                customer.getLastname(),
                customer.getAge()
        });
    }

    /**
     * Reads a customer from the database
     * */
    public Customer read(int id) {
        String sql = "SELECT * FROM CUSTOMER WHERE id = ?";
        Customer customer = (Customer) getJdbcTemplate().queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(Customer.class));
        return customer;
    }

    /**
     * Selectes all customers from the database
     * */
    public List<Customer> readAll() {
          String sql = "SELECT * FROM CUSTOMER";
          List <Customer> customerlist = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Customer.class));
          return customerlist;
    }

    /**
     * Updates a Customer in the database
     * */
    public void update(Customer customer) {
        Object[] args = { customer.getFirstname(),
                customer.getLastname(),
                customer.getAge(),
                customer.getId() };

        String sql = "UPDATE CUSTOMER SET firstname = ?, lastname = ?, age = ? where id = ?";
        jdbcTemplate.update(sql, args);
    }

    /**
     * Deletes a Customer from database
     * */
    public void delete(int id) {
        String sql = "DELETE FROM CUSTOMER WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    /**
     * Deletes all Customers from database
     * */
    public void deleteAll() {
        String sql = "DELETE FROM CUSTOMER";
        jdbcTemplate.update(sql);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

}
