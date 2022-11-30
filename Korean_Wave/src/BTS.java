import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

public class BTS implements Kpop {
    public void show_information() { // 8.파일 입/출력 사용
        try {
            Reader reader = new FileReader("OOP_Task/Korean_Wave/src/BTS.txt");
            int ch;
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
                Thread.sleep(30);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            init();
            show_information();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
            e.printStackTrace();
        }
    }

    public void input(String contend) { // 8.파일 입/출력 사용
        try {
            Writer writer = new FileWriter("OOP_Task/Korean_Wave/src/BTS.txt",
                    true);
            contend = contend + "\n";
            writer.write(contend);

            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            init();
            input(contend);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }

    public void init() { // 8.파일 입/출력 사용
        try {
            Writer writer = new FileWriter("OOP_Task/Korean_Wave/src/BTS.txt");
            String[] array = { // 6.참조 타입 (배열)
                    "☆ 방탄소년단(BTS)☆\n",
                    "멤버 = 진, 슈가, 제이홉, RM, 지민, 뷔, 정국\n",
                    "리더 = RM\n",
                    "데뷔일: 2013.6.13.\n",
                    "소속사: BIGHITMUSIC\n",
                    "BTS 유명곡: Dynamite - https://youtu.be/gdZLi9oWNZg\n",
                    "BTS 노래목록: 봄날, Fake Love, DNA, IDOL",
                    "BTS 유튜브: https://www.youtube.com/@BTS\n",
                    "BTS에 더 자세히 알고싶다면? -> https://ibighit.com/bts/kor/\n",
                    "----------------------------------------------------------------------------\n" };
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i]);
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
