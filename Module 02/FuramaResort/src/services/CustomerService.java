package services;

import models.Person.Customer;


public interface CustomerService extends Service{
    void displayAll();

    void addNewCustomer();

    void editCustomer();

    int getCustomerIndex(Customer customer);

    Customer findCustomer(int inputID);

    Customer getCustomerInfo();
}
