package prac01.polymorphism2.polymorphism;

public class pro_155652 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 프로그래머스 테스트 케이스
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        System.out.println("실행 결과: " + sol.solution(s, skip, index));
        // happy가 출력되면 정답!
    }
}

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        // 1. s의 문자열을 한 글자씩 쪼개서 반복
        for (char c : s.toCharArray()) {
            int count = 0; // 몇 번(유효하게) 밀었는지 세는 카운터

            // 2. index 횟수만큼 다 채울 때까지 문자를 뒤로 민다
            while (count < index) {
                c++; // 알파벳을 하나 뒤로 밈 (예: 'a' -> 'b')

                // 3. 'z'를 넘어가면 다시 'a'로 돌아오게 처리
                if (c > 'z') {
                    c -= 26;
                }

                // 4. 밀어낸 알파벳이 skip에 포함되어 있지 "않을 때만" 카운트 증가!
                // (skip에 있으면 카운트를 안 올리니까 다음 바퀴에 한 번 더 밀게 됨)
                if (!skip.contains(String.valueOf(c))) {
                    count++;
                }
            }
            // index만큼 다 밀어낸 최종 문자를 정답에 추가
            answer.append(c);
        }

        return answer.toString();
    }
}