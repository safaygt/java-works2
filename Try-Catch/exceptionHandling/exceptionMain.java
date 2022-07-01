package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class exceptionMain {

	public static void main(String[] args) {
		
		
		/*
		
		try {
		int[] sayilar = new int[] {1,2,3};
		
		
		System.out.println(sayilar[5]);
		
		}catch (Exception exception) {
			System.out.println("Hata oluştu. Index degerinden fazla bir deger istediniz.");
			
		}finally {
			
			System.out.println("Her zaman çalışırım");
			
		}
		
		*/
		
		BufferedReader reader = null;
		
		
		int total = 0;
		
		
		try {
			
			reader = new BufferedReader(new FileReader("C:\\javademos\\exceptionHandling\\src\\sayilar.txt"));
			String line = null;
			
			while((line = reader.readLine()) != null) {
				

				total += Integer.valueOf(line);
				
			}
			System.out.println("Toplam = "+ total);
		}
		catch (Exception e) {
			System.out.println("The file can't found");
		}
		
		try {
			reader.close();
		}
		catch (Exception e) {
			System.out.println("The file cannot closed.");
		}
		

	}

}
