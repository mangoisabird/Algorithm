import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // num_list => 
        // list 기존
        // list 새로넣기
        
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        ArrayList<Integer> newList = new ArrayList<Integer>(); 
        
        // 리스트에 num_list 값들을 하나씩 넣어준다
        for(int i = 0; i < num_list.length; i++){
            list.add(num_list[i]);
        }
        
        // n번째 이후 원소들을 num_list에 넣기
        
        for(int i = 0; i < num_list.length - n; i++){
            newList.add(num_list[n+i]);
        }
        
        for(int i = 0; i < n; i++){
            newList.add(num_list[i]);
        }
        
        /*
        while(!list.isEmpty()){
            newList.add(list.remove(0));
        }
        */
        
        int[] answer = new int[newList.size()];
        
        for (int i = 0; i < newList.size(); i++){
            answer[i] = newList.get(i);
        }
        
        return answer;
    }

}