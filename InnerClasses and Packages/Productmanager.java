
public class Productmanager {

	public void add(product p) {
		
		if (productValidator.isValid(p)) {
		System.out.println("Product has been added.");

		}
	
	else {
		System.out.println("Product can't be add");
	}
	
}
}
