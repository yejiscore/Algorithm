import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        String[] arr = myStr.split("[abc]");
        List<String> list = new ArrayList<>();
        
        for(String s : arr){
            if(!s.equals("")){
                list.add(s);
            }
        }
        
        if(list.size() == 0){
            return new String[]{"EMPTY"};
        }
        
        return list.toArray(new String[0]);
    }
}