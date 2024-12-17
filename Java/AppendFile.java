import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        // Paths of the source and destination files
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        // Append the content of the source file to the destination file
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath, true))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a new line after each line
            }
            System.out.println("File appended successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while appending the file.");
            e.printStackTrace();
        }
    }
}
