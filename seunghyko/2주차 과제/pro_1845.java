import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // 1. 홍 박사님이 허락한 '최대로 가져갈 수 있는 폰켓몬의 수'
        int maxChoose = nums.length / 2;

        // 2. HashSet을 이용해 중복을 제거하여 폰켓몬의 종류를 파악
        HashSet<Integer> typeSet = new HashSet<>();
        for (int num : nums) {
            typeSet.add(num);
        }

        // 3. 고를 수 있는 최대 종류의 수는
        // '가져갈 수 있는 수'와 '존재하는 종류의 수' 중 더 작은 값
        return Math.min(maxChoose, typeSet.size());
    }
}