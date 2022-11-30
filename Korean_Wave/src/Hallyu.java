import java.util.Scanner;

// cmd 실행  c: && cd c:\Users\cksdn\Desktop\CWL\study\2022_2 && cmd /C ""C:\Program Files\Java\jdk-18.0.2.1\bin\java.exe" -XX:+ShowCodeDetailsInExceptionMessages -cp C:\Users\cksdn\AppData\Roaming\Code\User\workspaceStorage\fe116003b39376f70879c0d73707d526\redhat.java\jdt_ws\2022_2_4d77f9fa\bin Hallyu "
public class Hallyu { // 메인 클래스입니다.
    public static void main(String[] args) throws Exception { // 4.예외처리
        // 변수 선언
        Scanner sc = new Scanner(System.in, "EUC-KR");
        String cmd, contend;
        Kpop bts = new BTS(); // 5.필드 다형성(인터페이스)
        Kpop blk = new BLACKPINK(); // 5.필드 다형성(인터페이스)
        Execute exc = new Execute();
        Thriller thriller = new Thriller();
        Romance romance = new Romance();
        Historical historical = new Historical();

        // 프로그램 시작
        typing("안녕하세요.\n이찬우의 한류 소개프로그램입니다!\nKpop과 한국 드라마 2개의 장르를 소개시켜드립니다.\n이 프로그램은 명령어로 작동됩니다.\n명령어 목록은 help명령어로 확인할 수 있습니다.\n즐거운 이용바랍니다!\n문의: cksdn63@naver.com");
        pause(0);
        while (true) { // 명령어 동작
            typing("명령어를 입력하세요.(도움말: help)");
            cmd = sc.nextLine();
            if (cmd.equals("exit")) {
                sc.close();
                pause(1);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.exit(0);
            } // help 명령어
            else if (cmd.equals("help")) {
                typing("-명령어-\nshow(보기), input(입력), init(초기화), exit(종료)\n\nKpop은 show, input, init 모두 가능합니다.\n한국드라마는 show만 가능합니다.");
                pause(0);
            } // show 명령어
            else if (cmd.equals("show")) {
                typing("Kpop혹은 Drama를 입력하세요.");
                cmd = sc.nextLine();
                // Kpop 입력
                if (cmd.equals("Kpop") || cmd.equals("kpop")) {
                    typing("당신에게 Kpop 유명그룹을 소개합니다!\nBTS와 BLACKPINK 중에 관심있는 그룹을 입력해주세요.");
                    cmd = sc.nextLine();
                    if (cmd.equals("BTS") || cmd.equals("bts")) {
                        bts.show_information();
                        pause(0);
                        typing("추가하고 싶은 내용이나 남기고 싶은 글이 있으면 input명령어를 이용해보세요!");
                        pause(0);
                    } // BLACKPINK 입력
                    else if (cmd.equals("BLACKPINK") || cmd.equals("blackpink")) {
                        blk.show_information();
                        pause(0);
                        typing("추가하고 싶은 내용이나 남기고 싶은 글이 있으면 input명령어를 이용해보세요!");
                        pause(0);
                    } else { // 잘못된 명령어 입력
                        typing("잘못된 입력입니다.");
                        pause(0);
                    }
                } // Drama입력
                else if (cmd.equals("Drama") || cmd.equals("drama") || cmd.equals("DRAMA")) {
                    typing("당신에게 유명 한국드라마를 소개합니다.");
                    exc.Genre(thriller);
                    cmd = sc.nextLine();
                    // 스릴러 입력
                    if (cmd.equals("Thriller") || cmd.equals("thriller") || cmd.equals("THRILLER")) {
                        exc.show(thriller);
                        pause(0);
                        typing("다른 장르의 한국 드라마도 확인해보세요!");
                        pause(0);
                    } // 로맨스 입력
                    else if (cmd.equals("Romance") || cmd.equals("romance") || cmd.equals("ROMANCE")) {
                        exc.show(romance); // 5.매개변수 다형성(상속)
                        pause(0);
                        typing("다른 장르의 한국 드라마도 확인해보세요!");
                        pause(0);
                    } // 사극 입력
                    else if (cmd.equals("Historical") || cmd.equals("historical") || cmd.equals("HISTORICAL")) {
                        exc.show(historical); // 5.매개변수 다형성(상속)
                        pause(0);
                        typing("다른 장르의 한국 드라마도 확인해보세요!");
                        pause(0);
                    } else { // drama 장르 잘못 입력
                        typing("잘못된 입력입니다.");
                        pause(0);
                    }
                } else { // 잘못 입력
                    typing("잘못된 입력입니다.");
                    pause(0);
                }
            } // input 명령어
            else if (cmd.equals("input")) {
                typing("BTS와 BLACKPINK중 입력해주세요.");
                cmd = sc.nextLine();
                // BTS 입력
                if (cmd.equals("BTS") || cmd.equals("bts")) {
                    typing("BTS에 추가할 내용을 입력해주세요.");
                    contend = sc.nextLine();
                    bts.input(contend);
                    bts.show_information();
                    pause(0);
                } // BLACKPINK 입력
                else if (cmd.equals("BLACKPINK") || cmd.equals("blackpink")) {
                    typing("BLACKPINK에 추가할 내용을 입력해주세요.");
                    contend = sc.nextLine();
                    blk.input(contend);
                    blk.show_information();
                    pause(0);
                } else { // 잘못된 명령어 입력
                    typing("잘못된 입력입니다.");
                    pause(0);
                }
            } // init 명령어
            else if (cmd.equals("init")) {
                typing("BTS와 BLACKPINK중 입력해주세요.");
                cmd = sc.nextLine();
                // BTS 입력
                if (cmd.equals("BTS") || cmd.equals("bts")) {
                    bts.init();
                    typing("완료되었습니다!");
                    pause(0);
                } // BLACKPINK 입력
                else if (cmd.equals("BLACKPINK") || cmd.equals("blackpink")) {
                    blk.init();
                    typing("완료되었습니다!");
                    pause(0);
                } else { // 잘못된 명령어 입력
                    typing("잘못된 입력입니다.");
                    pause(0);
                }
            } else { // 잘못된 명령어 입력
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                typing("잘못된 입력입니다.");
                pause(0);
            }
        }
    }

    public static void pause(int key) { // ENTER키를 누를때까지 프로그램을 대기시키는 함수입니다.
        Scanner scan = new Scanner(System.in);
        if (key == 1) {
            scan.close();
        } else {
            try { // 4.예외처리
                String enter = "ENTER키를 누르세요.";
                char[] charArray = enter.toCharArray();
                System.out.println();
                for (char ch : charArray) {
                    System.out.print(ch);
                    Thread.sleep(70);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            scan.nextLine();
        }
    }

    public static void typing(String str) { // 출력에 타이핑 효과를 주는 함수입니다.
        try { // 4.예외처리
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            char[] charArray = str.toCharArray();
            for (char ch : charArray) {
                System.out.print(ch);
                Thread.sleep(70);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
