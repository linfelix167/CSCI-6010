import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.charset.Charset;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReadWriteTextFileVersionOne {
	public static void main(String[] args) throws IOException {
		
		String fileName = "myInput.txt";
		
		//Create a myInput.txt file and write content to myInput.txt file
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            // String contents written to the file
			String content = "This is the sentence to write into file.\n";
			bw.write(content);
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Reading myInput.txt by using Buffered Stream I/O
		//Writing the sentence which is from myInput.txt to myOutput.txt
        Charset charset = Charset.forName("US-ASCII");
        BufferedReader reader = null; // Opens a file for reading
        BufferedWriter writer = null; // Opens or creates a file for writing
        Path file = FileSystems.getDefault().getPath("", "myInput.txt");
        Path file2 = FileSystems.getDefault().getPath("", "myOutput.txt");
        try {
        	reader = Files.newBufferedReader(file, charset);
        	writer = Files.newBufferedWriter(file2, charset);
        	String line = null;
                while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                        writer.write(line);
                } 
        } 
        catch (IOException x) {
                System.err.format("IOException: %s%n", x);
        } 
        finally {
        	if(reader != null){
        		reader.close();
        	}
        	if(writer != null){
        		writer.close();
        	}
        }
}

}
