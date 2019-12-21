package monAPp;

import entities.Address;
import entities.Customer;
import entities.Invoice;
import model.CustomerDAO;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

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

        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        Invoice invoice3 = new Invoice();

        List<Invoice> invoiceList = new ArrayList<>();
        invoiceList.add(invoice1);
        invoiceList.add(invoice2);
        invoiceList.add(invoice3);

        daniel.setInvoices(invoiceList);

        customerDAO.saveCustomer(daniel);

        System.out.println(customerDAO.showCustomer(1L));

    }

}




















