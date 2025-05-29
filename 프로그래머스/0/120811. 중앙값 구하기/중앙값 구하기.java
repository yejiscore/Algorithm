import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int n = array.length;
        n /= 2;
        Arrays.sort(array);
        return array[n];
    }
}