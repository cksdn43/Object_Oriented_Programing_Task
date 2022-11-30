import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Romance extends Kdrama { // 2.클래스 상속
    // 7.컬렉션프레임워크 - hashmap
    Map<String, String> rek = new HashMap<String, String>();

    // 생성자
    Romance() {
        rek.put("도깨비", "NETPLIX");
        rek.put("사랑의 불시착", "NETPLIX");
        rek.put("별에서 온 그대", "NETPLIX");
        rek.put("동백꽃 필 무렵", "WATCHA");
        rek.put("이상한 변호사 우영우", "NETPLIX");
    }

    // 장르별 추천 드라마를 출력합니다.
    @Override
    public void introduce() { // hashmap에 저장된 값을 출력합니다.
        Genre G = Genre.Romance;
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