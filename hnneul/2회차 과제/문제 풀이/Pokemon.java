import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // 1. 가져갈 수 있는 수 구하기
        int Pick = nums.length/2;

        // 2. HashSet 만들기
        HashSet<Integer> set = new HashSet<>();

        // 3. nums를 반복문으로 돌면서 set에 넣기
        for (int i=0; i<nums.length; i++){
            int Pokemon = nums[i];
            set.add(Pokemon);
        }
        int Count = set.size();

        // 4. set 크기와 가져갈 수 있는 수 중 작은 값 return
        if(Pick > Count){
            return Count;
        } else{
            return Pick;
        }
    }
}