import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


    public class sort {

        public static void main(String[] args) throws IOException {
            List<String> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream("new.txt"), Charset.forName("UTF-8")));

            String line;
            while((line = reader.readLine())!=null){
                list.add(line);
            }
            reader.close();

            list.sort((o1, o2) -> (o1.length() - o2.length()));

            BufferedWriter writer  = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("result.txt"),Charset.forName("UTF-8")
            ));
            for (String s1:list){
                writer.write(s1);
                writer.write('\n');
            }
            writer.flush();
            writer.close();

        }
    }
