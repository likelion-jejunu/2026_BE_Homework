import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();

        // 선수 이름이 몇 번째에 있는지 저장
        for (int i = 0; i < players.length; i++) {
            String name = players[i];
            map.put(name, i);
        }

        // 불린 선수는 바로 앞 선수와 자리 바꿈
        for (int i = 0; i < callings.length; i++) {
            String name = callings[i];

            int index = map.get(name);

            String front = players[index - 1];

            players[index - 1] = name;
            players[index] = front;

            // 자리 바꿨으니까 HashMap도 다시 저장
            map.put(name, index - 1);
            map.put(front, index);
        }

        return players;
    }
}
