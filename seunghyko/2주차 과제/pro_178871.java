import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 1. Race 객체 생성 및 초기화
        Race race = new Race(players);

        // 2. 해설진의 호출에 따라 추월 진행
        for (String calling : callings) {
            race.overtake(calling);
        }

        // 3. 최종 결과 반환
        return race.getResult();
    }
}

/**
 * 달리기 경주를 모델링한 클래스
 */
class Race {
    // 선수의 이름으로 현재 등수를 $O(1)$로 찾기 위한 맵
    private final Map<String, Integer> playerRanks;
    // 등수로 선수의 이름을 찾고, 최종 결과를 반환하기 위한 배열
    private final String[] positions;

    public Race(String[] initialPlayers) {
        this.positions = initialPlayers.clone();
        this.playerRanks = new HashMap<>();

        // 초기 등수 세팅
        for (int i = 0; i < initialPlayers.length; i++) {
            playerRanks.put(initialPlayers[i], i);
        }
    }

    /**
     * 특정 선수가 앞 사람을 추월하는 행위
     * @param playerName 호명된(추월한) 선수 이름
     */
    public void overtake(String playerName) {
        int currentRank = playerRanks.get(playerName);

        // 이미 1등인 경우 추월할 수 없음 (문제 조건상 호명되지 않지만 안전장치)
        if (currentRank == 0) return;

        int frontRank = currentRank - 1;
        String frontPlayerName = positions[frontRank];

        // 1. 배열 위치 교환 (positions)
        positions[frontRank] = playerName;
        positions[currentRank] = frontPlayerName;

        // 2. 맵 등수 교환 (playerRanks)
        playerRanks.put(playerName, frontRank);
        playerRanks.put(frontPlayerName, currentRank);
    }

    /**
     * 최종 경주 결과를 반환
     * @return 1등부터 순서대로 담긴 선수 이름 배열
     */
    public String[] getResult() {
        return positions;
    }
}