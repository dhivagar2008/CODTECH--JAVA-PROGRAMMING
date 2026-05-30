import java.io.*;

public class FileHandler {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, this is a test file.");
            writer.newLine();
            writer.write("Second line of text.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Modify file (append text)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine();
            writer.write("Appended line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
