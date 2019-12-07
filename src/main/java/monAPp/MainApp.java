package monAPp;

import entities.Customer;
import model.CustomerDAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {

    public static void main(String[] args) {

        CustomerDAO customerDAO = new CustomerDAO();

        Customer daniel = new Customer();
        daniel.setId(1L);
        daniel.setName("daniel");

        customerDAO.saveCustomer(daniel);

        System.out.println("Client: "+customerDAO.showCustomer(1L).getName());

        customerDAO.deleteCustomer(1L);

        System.out.println(customerDAO.showCustomer(1L).getName());



    }

}
