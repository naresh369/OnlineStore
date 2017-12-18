
public class ProductDBStore {
	
Product [] A= new Product[5];
	
	public ProductDBStore() {
		
		
		 A[0]= new Product(1234, "iphone", 999.00, "Brand new phone", 70);
		 A[1]= new Product(2345, "samsung", 699.00, "New samsung note 8", 68);
		 A[2]= new Product(3456, "HPenvy", 850.00, "HP envy x360", 40);
		 A[3]= new Product(4566, "dell", 750.00, "the dell laptop ", 50);
		 A[4]= new Product(5678, "lenovo", 699.00, "gaming lappy", 48);
		 
		 
	}

	public Product[] getA() {
		return A;
	}

	public void setA(Product[] a) {
		A = a;
	}

	

	
	

}
