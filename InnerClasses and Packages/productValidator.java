
public class productValidator {
	public static boolean isValid(product p) {
		
		if (!(p.name.isEmpty()) && p.price > 0) {
			
			return true;
			
		}
		else {
			return false;
		}
		
	}
	

}
