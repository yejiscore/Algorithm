import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        double sqrt = Math.sqrt(n);
        List<Integer> list = new ArrayList<>();
    
        for (int i = 1; i <= (int) sqrt; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) list.add(n / i);
            }
        }
        
        list.sort(null);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}