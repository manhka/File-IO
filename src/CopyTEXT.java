import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyTEXT {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\file 2"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\file_copy"));
            String s = "";
            String data = "";
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.write(s);
                System.out.println(s);
            }
            bufferedWriter.close();

        } catch (Exception e) {
            return;
        }
    }
}
