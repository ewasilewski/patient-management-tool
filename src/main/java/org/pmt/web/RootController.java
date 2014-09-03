package org.pmt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {

    private CustomerDao customerDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRoot() {
        return "index";
    }

    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

}
