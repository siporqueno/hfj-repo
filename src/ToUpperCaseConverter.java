import java.io.FileWriter;
import java.io.IOException;

public class ToUpperCaseConverter {
    private static String inputString = "Java";

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\vip\\Documents\\outputFile.txt");
            writer.write(inputString.toUpperCase());
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
