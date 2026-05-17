class Solution {
    public String solution(String s, String skip, int index) {

        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int steps = 0;

            while (steps < index) {
                c++;
                if (c > 'z') {
                    c = 'a';
                }
                boolean isSkip = false;
                for (int j = 0; j < skip.length(); j++) {
                    if (c == skip.charAt(j)) {
                        isSkip = true;
                        break;
                    }
                }
                if (!isSkip) { steps++;}
            }
            answer += c;
        }

        return answer;
    }
}
