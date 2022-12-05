import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

public class BLACKPINK implements Kpop {
    public void show_information() {
        try { // 8.파일 입/출력 사용
            Reader reader = new FileReader("OOP_Task/Korean_Wave/src/BLACKPINK.txt");
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

    public void input(String contend) {
        try { // 8.파일 입/출력 사용
            Writer writer = new FileWriter("OOP_Task/Korean_Wave/src/BLACKPINK.txt",
                    true);
            contend = contend + "\n";
            System.out.println(contend);
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

    public void init() {
        try { // 8.파일 입/출력 사용
            Writer writer = new FileWriter("OOP_Task/Korean_Wave/src/BLACKPINK.txt");

            String[] array = { // 6.참조 타입 (배열)
                    "☆ 블랙핑크(BLACKPINK)☆\n",
                    "멤버 = 지수, 제니, 리사, 로제\n",
                    "리더 = 없음\n",
                    "데뷔일: 2016.8.8.\n",
                    "소속사: YGENTERTAINMENT\n",
                    "BLACKPINK 유명곡: 뚜두뚜두 - https://youtu.be/IPzouyj7FLA\n",
                    "BLACKPINK 노래 목록: 불장난, 마지막처럼, 휘파람, Kill This Love, Forever Young, 붐바야, Stay, How You Like That\n",
                    "BLACKPINK 유튜브: https://www.youtube.com/channel/UCOmHUn--16B90oW2L6FRR3A\n",
                    "BLAKPINK에 더 자세히 알고싶다면? -> https://www.ygfamily.com/artist/main.asp?LANGDIV=K&ATYPE=2&ARTIDX=70\n",
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
