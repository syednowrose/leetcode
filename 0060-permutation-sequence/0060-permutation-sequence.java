class Solution {
    public String getPermutation(int n, int k) {

        boolean[] used = new boolean[n + 1];
        int fact = 1;

        for(int i = 1; i < n; i++){
            fact *= i;
        }

        k--;

        String result = "";

        for(int i = n; i >= 1; i--){

            int index = k / fact;
            int count = 0;

            for(int j = 1; j <= n; j++){
                if(!used[j]){
                    if(count == index){
                        result += j;
                        used[j] = true;
                        break;
                    }
                    count++;
                }
            }

            k = k % fact;

            if(i > 1){
                fact = fact / (i - 1);
            }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {

        int n = 3;
        int k = 3;

        Solution s = new Solution();
        String ans = s.getPermutation(n, k);

        System.out.println(ans);
    }
}