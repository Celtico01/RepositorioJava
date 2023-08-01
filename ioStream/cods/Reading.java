package ioStream.cods;
/*steps
 * 1º import java.io
 * 2º create the outputStream object based on the source
 * 3º call read to read data
 * 4º close
 * 5º handle FNFE and IoException
 */

/*constructors fileinputstream
 * FileInputStream(File file)
Creates a FileInputStream by opening a connection to an actual file, 
the file named by the File object file in the file system.

FileInputStream(FileDescriptor fdObj)
Creates a FileInputStream by using the file descriptor fdObj, 
which represents an existing connection to an actual file in the file system.

FileInputStream(String name)
Creates a FileInputStream by opening a connection to an actual file, 
the file named by the path name name in the file system.
 */

import java.io.*; //1º step

public class Reading {
	
	public static void main(String[] args)  throws FileNotFoundException, IOException{ //5º step but incomplete
		String filePath = "C:\\Users\\alanm\\OneDrive\\Área de Trabalho\\Repositório Java\\src\\ioStream\\cods\\files\\abc.txt";
		//to create the object you have to handle FNFE and IOException!
		FileInputStream inStrm = new FileInputStream(filePath);// 2º step
		
		int data; 
		//data = inStrm.read(); //3º step
		
		//System.out.println((char) data);
		
//		inStrm.close(); //4º step
		
		//to read the entire file:
		while((data = inStrm.read()) != -1) {
			System.out.print((char) data);
		}
		inStrm.close();
		
	}

}
