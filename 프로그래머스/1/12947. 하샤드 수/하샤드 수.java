class Solution {
    public boolean solution(int x) {
        
        int originx = x; 
        int harshad = 0;
        
        while (x > 0) {
            harshad += x % 10;
            x /= 10;
        }
        
        return (originx % harshad == 0) ? true : false;
    }
}