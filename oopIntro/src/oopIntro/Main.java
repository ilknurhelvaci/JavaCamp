package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product product = new Product(1, "Lenova", 16000, "lENOVA 16GB Ram",10);
        
        
       System.out.println(product.getUnitPriceAfterDiscount());
       productManager pro = new productManager();
       pro.addToCart(product);
	
	}

}
