public class Solution {
  public int[] solution(int []arr) {
    int[] answer = {};
    int count = 0;
    for(int i=0; i<arr.length-1; i++){
      if(arr[i] != arr[i+1]){
        count++;
      }
    }
    answer = new int[count+1];
    int index = 0;
    for(int i=0; i<arr.length-1; i++){
      if(arr[i] != arr[i+1]){
        answer[index] = arr[i];
        index++;
      }
    }
    answer[index] = arr[arr.length-1];
    
    return answer;
  }
  
}
