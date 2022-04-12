import java.io.BufferedReader;
import java.io.FileReader;

public class mazInFile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("src\\file1"));
            String s="";
            int k=0;
            int max=Integer.parseInt(bufferedReader.readLine());
            while ((s=bufferedReader.readLine())!=null){
                k=Integer.parseInt(s);
                if (k>max){
                    max=k;
                }
            }
            bufferedReader.close();
            System.out.println("max="+max);
        }catch (Exception e){
            return;
        }
    }
}
