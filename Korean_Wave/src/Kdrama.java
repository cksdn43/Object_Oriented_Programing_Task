public class Kdrama { // 부모클래스
    public enum Genre { // 6.참조 타입(열거)
        Thriller,
        Romance,
        Historical
    }

    public void introduce() { // 상속을 위한 함수입니다.
        System.out.print("한국드라마");
    }

    public void showgenre() { // 열거를 이용하여 장르를 소개합니다.
        Genre[] genres = Genre.values();
        String p = "";
        for (Genre genre : genres) {
            p = p + genre + " ";
        }
        typing(p + "중에서 입력하세요.");
    }

    public static void typing(String str) { // 출력에 타이핑 효과를 주는 함수입니다.
        try {
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
