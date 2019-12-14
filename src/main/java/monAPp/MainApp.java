package monAPp;

import entities.Address;
import entities.Customer;
import model.CustomerDAO;

public class MainApp {

    public static void main(String[] args) {

        CustomerDAO customerDAO = new CustomerDAO();


        Address address = new Address();
        address.setStreet("middle street");
        address.setHouseNumber("2A");
        address.setZipCode(11111);
        address.setCity("world");

        Customer daniel = new Customer();
        daniel.setId(1L);
        daniel.setName("daniel");
        daniel.setAddress(address);

        customerDAO.saveCustomer(daniel);

        System.out.println(customerDAO.showCustomer(1L));

    }

}
