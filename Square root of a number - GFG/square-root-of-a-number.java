//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		long s=0;long e=x;
		while(s <= e){
		    long mid = s+(e-s)/2;
		    if(mid*mid == x){
		        return mid;
		}
		else if(mid*mid < x){
		    s = mid+1;
		}
		else{
		    e=mid-1;
		}
	 }
	 return e;
}
}
