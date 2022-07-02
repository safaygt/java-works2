import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWorks {

public static void createFile() {
		
		File file = new File("C:\\javademos\\files\\students.txt");
		try {
			if (file.createNewFile( )) {
				
				System.out.println("Dosya oluşturuldu.");
				
			}
			else {
				
				System.out.println("Dosya zaten mevcut.");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void getFileInfo() {
		
		File file = new File("C:\\javademos\\files\\students.txt");
		if(file.exists()) {    // eğer dosya varsa.
			
			System.out.println("Dosya adı: "+file.getName());  // dosya ismini verir.
			System.out.println("Dosya yolu: "+file.getAbsolutePath()); // dosya yolunu verir.
	
			System.out.println("Dosya yazılabilir mi: "+ file.canWrite());  // dosya yazılabilir mi kontrol eder.
			System.out.println("Dosya okunabilir  mi: "+ file.canRead());  // dosya okunabilir mi kontrol eder.
			System.out.println("Dosya boyutu: "+ file.length());  // dosya boyutunu verir.
		}
		
		
	}
	
	public static void readFile() {
		File file = new File("C:\\javademos\\files\\students.txt");
		
		try {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				
				String line = scanner.nextLine();
				
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true)); 
			// dosya yolunun yanına true değeri yazmamızın sebebi, append özelliğini aktif hale getirmek. Yani yazdığımız şeyi varolan bir dosyaya ekler.
			writer.newLine(); // bir alt satıra geçmemize yarar.
			writer.write("Java programlamaya hoşgeldiniz.");
			
			writer.close();
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
