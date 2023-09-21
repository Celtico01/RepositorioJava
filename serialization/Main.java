package serialization;

import java.io.IOException;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Product camisa = new Product("camisa", 20);
		System.out.println(camisa);
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("produto.byteJ"));
//		
//		oos.writeObject(camisa);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("produto.byteJ"));
		Product produto = (Product) ois.readObject();
		System.out.println(produto);
		
	}

}
