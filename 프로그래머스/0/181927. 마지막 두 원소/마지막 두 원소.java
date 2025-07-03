class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];
        
        if (last > secondLast) {
            int[] result = new int[num_list.length + 1];
            System.arraycopy(num_list, 0, result, 0, num_list.length);
            result[num_list.length] = last - secondLast;
            return result;
        } else { 
            int[] result = new int[num_list.length + 1];
            System.arraycopy(num_list, 0, result, 0, num_list.length);
            result[num_list.length] = last * 2;
            return result;
        }
    }
}