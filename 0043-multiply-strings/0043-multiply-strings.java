import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger st1 = new BigInteger(num1);
        BigInteger st2 = new BigInteger(num2);
        BigInteger result = st1.multiply(st2);
        return result.toString();
    }
}
class Main{
    public static void main(String [] args){
        String num1 ="2";
        String num2 ="3";
        Solution s = new Solution();
        System.out.println(s.multiply(num1,num2));
    }
}