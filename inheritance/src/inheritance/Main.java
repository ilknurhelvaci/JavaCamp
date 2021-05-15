package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndivudualCustomer ilknur = new IndivudualCustomer();
		ilknur.customerNumber ="1234";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber ="789";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber ="99999";
		
		CustomerManager customerManager = new CustomerManager();
		/* customerManager.add(hepsiBurada); //Polymorphism yapmýþ olduk
		customerManager.add(ilknur);
		customerManager.add(abc); */
		
		Customer[] customers = {ilknur,hepsiBurada,abc};
		customerManager.addMultiple(customers);

	}

}
