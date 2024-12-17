import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a simple file example!\n");
            writer.write("Java makes file handling easy.");
            writer.close();
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nReading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); // Close the file reader
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
