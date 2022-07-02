//package oneMore;
//
//import java.util.HashSet;
//import java.util.Set;
//
//class Solution {
//	boolean wordBreak (String uzerInput, String[] dictionary) {
//	    Set<String> storeWords = new HashSet<String>();
//		for(int i = 0; i < dictionary.length; i++) {
//			storeWords.add(dictionary[i]);
//		}
//		int n = uzerInput.length();
//		boolean[] dp = new boolean[n + 1];
//		dp[0] = true;
//		for (int i = 1; i <= n; i++) {
//			for (int j = i; j >= 0; j--) {
//				if(dp[j] == true && (i - j) <= n && storeWords.contains(uzerInput.substring(j, i))) {
//					dp[i] = true;
//				}
//			}
//		}
//		return dp[n];
//	}
//}