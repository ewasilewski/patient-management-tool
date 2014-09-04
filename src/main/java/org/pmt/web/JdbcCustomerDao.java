package org.pmt.web;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.util.List;

public class JdbcCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    public void createCustomer(Customer customer) {
        String sql = "INSERT INTO CUSTOMER " +
                "(firstname, lastname, age) VALUES (?, ?,?)";
        jdbcTemplate.update(sql, new Object[] {
                customer.getFirstname(),
                customer.getLastname(),
                customer.getAge()
        });
    }

    public Customer readCustomer(int id) {
        String sql = "SELECT * FROM CUSTOMER WHERE id = ?";
        Customer customer = (Customer) getJdbcTemplate().queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(Customer.class));
        return customer;
    }

    public List<Customer> readAll() {
          String sql = "SELECT * FROM CUSTOMER";
          List <Customer> customerlist = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Customer.class));
          return customerlist;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    public void deleteCustomer(int id) {
        String sql = "DELETE FROM CUSTOMER WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

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
