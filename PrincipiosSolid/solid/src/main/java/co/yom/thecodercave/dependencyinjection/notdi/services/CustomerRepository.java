package co.yom.thecodercave.dependencyinjection.notdi.services;

import co.yom.thecodercave.dependencyinjection.notdi.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Este repository tiene conexion a MySQL, el cual se crea en el constructor
 * Y luego se utiliza para comparar
 */
public class CustomerRepository {

    private final MySQLConnection connection;

    public CustomerRepository(MySQLConnection connection) {
        this.connection = connection;
    }

    public List<Customer> GetCustomers() {
        if (connection.getClass() == MySQLConnection.class) {
            System.out.println("Get Customers from MySQL");
        }

        // Lista de clientes que se devuelven
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "John Wick", "john@wick.com", "0273487620"));
        customers.add(new Customer(2, "Eastwood", "clint@ew.com","024840972"));

        return customers;
    }
}
