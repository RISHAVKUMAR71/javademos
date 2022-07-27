package longestincresingsubsequence;

public class TestLIS {

	public static void main(String[] args) {
		//int arr[] = { 1,2,3,4 };
		int arr[] = { 10, 17, 12, 15, 20,9,11,14,19,23,55,66 };
		int n = arr.length;
		System.out.println("largest increasing subsequence length is=" + longestincresingsubsequence.LISubsequence.lis(arr, n));
	}

}
