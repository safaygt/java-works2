import matematik.DortIslem;

public class mainInner {

	public static void main(String[] args) {
		
		// DataBaseHelper.Crud.create();   
		product p = new product();
		
		p.name="s";   // if p.name would be null, product can't be add. 
		p.price = 100; 
		Productmanager productmanager = new Productmanager();
		productmanager.add(p);
		
		
		
		DortIslem islem = new DortIslem();
		
		System.out.println(islem.carp(5, 7));

	}

}
