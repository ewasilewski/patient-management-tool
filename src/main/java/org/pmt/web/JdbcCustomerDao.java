package org.pmt.web;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import java.util.List;

public class JdbcCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void createCustomer(Customer customer) {

    }

    @Override
    public Customer readCustomer(int id) {
        return null;
    }

    public List<Customer> readAll() {
          String sql = "SELECT * FROM CUSTOMER";
          List <Customer> customerlist = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Customer.class));
          return customerlist;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public void deleteAll() {

    }


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

}
