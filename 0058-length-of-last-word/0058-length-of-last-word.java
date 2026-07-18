class Solution{
    public int lengthOfLastWord(String s){
        int n = s.length();
        int count = 0;
        int i= s.length()-1;

        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }

        while(i>=0 && s.charAt(i) != ' '){
            count ++;
            i--;
        }
        return count;
    }
}

class Main{
    public static void main(String[] args){
        String s ="iam syed nowroz";

        Solution sol = new Solution();
        int count = sol.lengthOfLastWord(s);
        System.out.println(count);
    }
}