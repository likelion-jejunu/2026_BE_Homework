import java.util.ArrayList; // ArrayList를 쓰기 위해 가져오는 도구
import java.util.Arrays;

public class pro_12906 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 프로그래머스 테스트 케이스
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        // Arrays.toString()은 배열을 예쁘게 [1, 3, 0, 1] 형태로 출력해 주는 도구입니다.
        System.out.println("첫 번째 결과: " + Arrays.toString(sol.solution(arr1)));
        System.out.println("두 번째 결과: " + Arrays.toString(sol.solution(arr2)));
    }
}

class Solution {
    public int[] solution(int[] arr) {
        // 1. 크기를 미리 알 수 없으니 현역 에이스 'ArrayList' 바구니 준비!
        ArrayList<Integer> list = new ArrayList<>();

        // 2. 방금 바구니에 넣은 숫자를 기억할 변수
        // (배열의 숫자가 0~9이므로, 절대 나올 수 없는 값인 -1로 초기 세팅)
        int lastNum = -1;

        // 3. 배열을 처음부터 끝까지 하나씩 확인
        for (int num : arr) {
            // 방금 넣은 숫자(lastNum)랑 지금 숫자(num)가 다를 때만!
            if (num != lastNum) {
                list.add(num);  // 바구니에 추가!
                lastNum = num;  // "방금 넣은 숫자"를 지금 숫자로 업데이트
            }
        }

        // 4. 프로그래머스는 일반 배열(int[])로 정답을 원하므로, ArrayList를 변환해 줌
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}