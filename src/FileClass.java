import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileClass {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\HappyBones\\Desktop\\frases.txt");
		File file2 =  new File("C:\\Users\\HappyBones\\Desktop\\tempFolder");
		File file3 = new File("C:\\Users\\HappyBones\\Desktop\\tempFolder\\temp2\\temp3");
		
		if(file.exists())
			System.out.println("Find It");
		else
			System.out.println("do not find it");
				
		if(file2.mkdir())
			System.out.println("Directory created!");
		else
			System.out.println("do not created!");
				
		if(file3.mkdirs())
			System.out.println("Directories created!");
		else
			System.out.println("do not created!");
		
		// ============= Reading a File ================
		FileReader fileReader = new FileReader("C:\\Users\\HappyBones\\Desktop\\exampleFile.txt");
		BufferedReader buffer = new BufferedReader(fileReader) ;
		String text;
		while(buffer.readLine() != null) {
			text = buffer.readLine();
			System.out.println("\n text ---> " + text);
		}
		
		// ============= Writing a File ================
		FileWriter fileWriter = new FileWriter("C:\\Users\\HappyBones\\Desktop\\exampleFile.txt",true);
		PrintWriter printer = new PrintWriter(fileWriter);
		
		printer.append("testing FileWriter");
		printer.println("testing println() method");
		
		fileReader.close();
		fileWriter.close();
	}

}
