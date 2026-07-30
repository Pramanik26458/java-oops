import java.io.*;

class Logger {

    private String path;

    Logger(String path) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        this.path = path;
    }

    public void log(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(message);
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Failed to log this message\n" + message);
        }
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        // ==============================
        // Creating a File
        // ==============================

        // File file = new File("./test.txt");

        // System.out.println(file.exists());

        // file.createNewFile();

        // System.out.println(file.exists());

        // ==============================
        // BufferedWriter
        // ==============================

        // try {
        //     BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));

        //     bw.write("hey i am writting to you");
        //     bw.newLine();
        //     bw.write("hey i am writting to you again");

        //     bw.flush();   // Flushes buffered data
        //     bw.close();   // Closes the stream

        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        // ==============================
        // BufferedReader
        // ==============================

        // BufferedReader br = null;

        // try {
        //     br = new BufferedReader(new FileReader("test.txt"));

        //     String line;

        //     while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        //     }

        // } catch (IOException e) {
        //     System.out.println(e.getMessage());

        // } finally {
        //     if (br != null) {
        //         br.close();
        //     }
        // }

        // ==============================
        // Try-With-Resources
        // ==============================

        // try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

        //     String line;

        //     while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        //     }

        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        // ==============================
        // Logger Example
        // ==============================

        Logger logger = new Logger("log.txt");

        logger.log("please log 1");
        logger.log("please log 2");
        logger.log("please log 3");
        logger.log("please log 4");
    }
}