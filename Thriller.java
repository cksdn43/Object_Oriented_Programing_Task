import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Thriller extends Kdrama { // 2.클래스 상속
    // 7.컬렉션프레임워크 - hashmap
    Map<String, String> rek = new HashMap<String, String>();

    // 생성자
    Thriller() {
        rek.put("오징어게임", "NETPLIX");
        rek.put("Sky캐슬", "NETPLIX");
        rek.put("지금우리학교는", "NETPLIX");
        rek.put("D.P.", "NETPLIX");
        rek.put("수리남", "NETPLIX");
    }

    // 장르별 추천 드라마를 출력합니다.
    @Override
    public void introduce() { // hashmap에 저장된 값을 출력합니다.
        Genre G = Genre.Thriller;
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        typing("장르: " + G);
        System.out.println("--------------------");
        typing("제목  |  스트리밍");
        System.out.println("--------------------");
        Set<String> keySet = rek.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            String value = rek.get(key);
            typing(key + " " + value);
        }
        System.out.println("--------------------");
    }
}
