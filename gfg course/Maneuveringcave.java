public class Maneuveringcave {
	static int numberOfPaths(int m, int n)
	{
		int[] dp = new int[n];
		dp[0] = 1;

		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[j] += dp[j - 1];
			}
		}

		return dp[n - 1];
	}
	public static void main(String args[])
	{
		System.out.println(numberOfPaths(3, 3));
	}
}
//m*n are rows*cols and last element after for loop shows the maximum paths possible