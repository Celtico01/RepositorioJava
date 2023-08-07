package ioStream.cods;

/*steps
 * 1º import java.io
 * 2º create the outputStream object based on the source
 * 3º call write to save data
 * 4º use flush
 * 5º close the stream
 * 6º handle FNFE and IoException
 */

/*constructors fileoutputstram
 * FileOutputStream(File file)
Creates a file output stream to write to the file represented by the specified File object.

FileOutputStream(FileDescriptor fdObj)
Creates a file output stream to write to the specified file descriptor, 
which represents an existing connection to an actual file in the file system.

FileOutputStream(File file, boolean append)
Creates a file output stream to write to the file represented by the specified File object.

FileOutputStream(String name)
Creates a file output stream to write to the file with the specified name.

FileOutputStream(String name, boolean append)
Creates a file output stream to write to the file with the specified name.
 */

import java.io.*; //1º step

public class Writing {
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String filePath = "C:\\Users\\alanm\\OneDrive\\Área de Trabalho\\Repositório Java\\src\\ioStream\\cods\\files\\";
		
		FileOutputStream outputStream = new FileOutputStream(filePath.concat("write.txt"), true); //2º step
		
		outputStream.write(100);
		System.out.println("data saved");
		
		outputStream.close();
	}

}
