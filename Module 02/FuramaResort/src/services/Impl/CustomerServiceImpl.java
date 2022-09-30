package services.Impl;

import models.Person.Customer;
import services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();

    @Override
    public void displayAll() {
        for (Customer customer: customerList){
            System.out.println(customer);
        }
    }

    @Override
    public void addNewCustomer() {
        Customer newCustomer = this.getCustomerInfo();
        customerList.add(newCustomer);
        System.out.println("Done!!!");
    }

    @Override
    public void editCustomer() {
        System.out.println("Input Customer's ID to edit: ");
        int inputID = Integer.parseInt(scanner.nextLine());
        Customer customer =this.findCustomer(inputID);
        int index = this.getCustomerIndex(customer);
        if (index != -1){
            System.out.println(customerList.get(index).toString());
            Customer newCustomer = this.getCustomerInfo();
            customerList.remove(index);
            customerList.add(index,newCustomer);
            System.out.println("Edited!!!");
        }else {
            System.out.println("Invalid Customer's ID!!!");
        }
    }

    @Override
    public int getCustomerIndex(Customer customer) {
        int index = customerList.indexOf(customer);
        return index;
    }

    @Override
    public Customer findCustomer(int inputID) {
        Customer customer = new Customer(inputID);
        int index = customerList.indexOf(customer);
        return customerList.get(index);
    }

    @Override
    public Customer getCustomerInfo() {
        System.out.println("Input new Customer info: ");
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input Date of birth: ");
        String date = scanner.nextLine();
        System.out.println("Input gender (male/female): ");
        String gender = scanner.nextLine();
        System.out.println("Input ID number: ");
        String idNumber = scanner.nextLine();
        System.out.println("Input phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Input email address: ");
        String mail = scanner.nextLine();
        System.out.println("Input Customer's ID: ");
        int customerID = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Customer's standard: ");
        String standard = scanner.nextLine();
        System.out.println("Input Customer's address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(name,date,gender,idNumber,phone,mail,customerID,standard,address);
        return customer;
    }
}
