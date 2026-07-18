class Solution {
    public int mySqrt(int x) {

       if(x==0){
        return 0;
       } 

       long sq = x;

       while(sq * sq > x){
        //formula
        sq = (sq + (x/sq)) / 2;
       }

       return (int)sq;
    }
}
class Main{
    public static void main(String [] args){
        Solution sol = new Solution();
        System.out.println(sol.mySqrt(8));
    }
}