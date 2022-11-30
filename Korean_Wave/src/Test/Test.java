package Test;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String str = "안녕하세요.\n이찬우의 한류 소개 프로그램입니다.\n명령어를 입력해주세요.(도움말: help)";
        try {
            for (int i = 0; i < str.length() + 1; i++) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println(str.substring(0, i));
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
