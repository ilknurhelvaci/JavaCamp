
package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName()+ customer.getLastName() + " tebrikler sisteme kayıt oldunuz");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName() + customer.getLastName() + " bigileriniz başarılı bir şekilde silimiştir");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName() + customer.getLastName() + " bilgileriniz başarılı bir şekilde güncellenmiştir");
    }
    
}
