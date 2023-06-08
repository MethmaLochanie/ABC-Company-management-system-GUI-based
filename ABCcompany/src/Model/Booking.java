package Model;

import java.util.ArrayList;

public class Booking {
    private static ArrayList<Customer> customers = new ArrayList<>();

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }
}
