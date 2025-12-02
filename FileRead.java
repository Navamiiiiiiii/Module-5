import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt"); // may throw FileNotFoundException
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine(); // may throw IOException
            System.out.println("First line: " + line);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found!");
        } catch (IOException e) {
            System.out.println("Error: Could not read from the file.");
        }
    }
}
