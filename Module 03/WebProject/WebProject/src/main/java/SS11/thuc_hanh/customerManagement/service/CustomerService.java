package SS11.thuc_hanh.customerManagement.service;

import SS11.thuc_hanh.customerManagement.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
