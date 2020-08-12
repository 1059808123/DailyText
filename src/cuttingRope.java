/**
 * @program: offer
 * @description: 切绳子问题
 * @author: LiHongyan
 * @create: 2020-08-13 00:31
 **/
public class cuttingRope {
    public static void main(String[] args) {
        System.out.println( cut(10));
    }

    public  static int cut(int n){
        int[] dp =new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= n ; i++){
            for(int j = 0; j < i; j++){
                dp[i] = Math.max(dp[i],Math.max((i-j)*j,dp[i-j]*j));
            }
        }
        return dp[n];
    }
}
