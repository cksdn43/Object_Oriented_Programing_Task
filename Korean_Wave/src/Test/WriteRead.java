package Test;

import java.io.FileWriter;
import java.io.Writer;
import java.io.FileReader;
import java.io.Reader;

public class WriteRead {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Users/cksdn/Desktop/CWL/study/2022_2/OOP_Task/Korean_Wave/src/test.txt",
                true);

        String[] array = {
                "추가1\n",
                "추가2\n",
                "추가3\n" };
        for (int i = 0; i < array.length; i++) {
            writer.write(array[i]);
        }

        writer.flush();
        writer.close();

        Reader reader = new FileReader("C:/Users/cksdn/Desktop/CWL/study/2022_2/OOP_Task/Korean_Wave/src/test.txt");
        int ch;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}
