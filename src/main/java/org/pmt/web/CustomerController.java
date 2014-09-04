package org.pmt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    private CustomerDao customerDao;

    /**
     * Shows all customers.
     */
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String indexCustomer() {
        return "customers/index";
    }

    /**
     * Shows empty customer form.
     */
    @RequestMapping(value = "/customers/new", method = RequestMethod.GET)
    public String newCustomer() {
        return "customers/new";
    }

    /**
     * Post a customer.
     */
    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public String createCustomer(Customer customer) {
        customerDao.createCustomer(customer);
        return "customers/show";
    }

    /**
     * Shows filled customer form.
     */
    @RequestMapping(value = "/customers/{id}/edit", method = RequestMethod.GET)
    public String editCustomer(@PathVariable int id) {
        return "customers/edit";
    }

    /**
     * Shows a customer.
     */
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public String showCustomer(@PathVariable int id, ModelMap modelMap) {
        Customer customer = customerDao.readCustomer(id);
        modelMap.addAttribute("customer", customer);
        return "customers/show";
    }

    /**
     * Updates a customer.
     */
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
    public String updateCustomer(@PathVariable int id, @ModelAttribute Customer customer) {
        return "customers/show";
    }

    /**
     * Deletes a customer.
     */
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
    public String deleteCustomer(@PathVariable int id) {
        return "customers/index";
    }

    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

}
