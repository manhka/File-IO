import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
       String file1="src\\bang1.csv";
       BufferedReader bufferedReader=null;
       String s="";
       try {
           bufferedReader=new BufferedReader(new FileReader(file1));
           while ((s=bufferedReader.readLine())!=null){
//               System.out.println(s);
               String[] arr= s.split(",");
               for (String a:arr
               ) {
                   System.out.print(a+"    ");
               }
               System.out.println();
           }
           bufferedReader.close();

       }
        catch (Exception E){
           return;
        }
}}
