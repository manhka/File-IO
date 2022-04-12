import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class SumInFile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("src\\file1"));
            String s="";
            int sum=0;
            while ((s=bufferedReader.readLine())!=null){
                sum+=Integer.parseInt(s);
            }
            bufferedReader.close();
            System.out.println("sum= "+sum);
        }catch (Exception e){
            return;
        }finally {
            System.out.println("end");
        }
    }
}
