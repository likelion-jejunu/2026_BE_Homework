public class SecretCode {
    public String solution(String s, String skip, int index) {
        String answer = "";

        // 1. s의 글자를 하나씩 확인
        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            int count = 0;

            // 2. skip에 없는 알파벳만 index번 세기
            while (count < index) {
                now++;

                // z 다음은 다시 a로 돌아가기
                if (now > 'z') {
                    now = 'a';
                }

                // skip에 없는 알파벳이면 한 칸 이동한 것으로 세기
                if (skip.indexOf(now) == -1) {
                    count++;
                }
            }

            // 3. 바뀐 글자를 answer에 붙이기
            answer += now;
        }

        return answer;
    }
}
