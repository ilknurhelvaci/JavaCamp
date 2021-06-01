package coffeeshopp;

import abstracts.BaseCustomerManager;
import concrete.NeroCustomerManager;
import entities.Customer;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
        baseCustomerManager.Save(new Customer(1, "İlknur", "Helvacı", LocalDate.of(1999, 4, 14), "11729993382"));

    }

}
