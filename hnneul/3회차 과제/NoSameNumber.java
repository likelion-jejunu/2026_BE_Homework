import java.util.ArrayList;

public class NoSameNumber {
    public int[] solution(int[] arr) {
        // 1. 정답을 임시로 담을 ArrayList 만들기
        ArrayList<Integer> list = new ArrayList<>();

        // 2. 첫 번째 숫자는 무조건 넣기
        list.add(arr[0]);

        // 3. 바로 앞 숫자와 다를 때만 list에 넣기
        for (int i = 1; i < arr.length; i++) {
            int before = arr[i - 1];
            int now = arr[i];

            if (before != now) {
                list.add(now);
            }
        }

        // 4. ArrayList를 int 배열로 바꾸기
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
