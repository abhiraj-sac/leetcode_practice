//{ Driver Code Starts
import java.util.*;


class Find_All_Possible_Strings
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			ArrayList<String> arr = g.spaceString(str);
			for(String s : arr){
			    System.out.print(s+"$");
			}
            System.out.println();
			t--;
		}
	}
}
// } Driver Code Ends


/*You have to complete this function*/
class GfG
{
    ArrayList<String> spaceString(String str)
    {
        // Your code here
        ArrayList<String>res=new ArrayList<>();
        getHelper(str,0,res,"",str.length());
        return res;
    }
    static void getHelper(String s,int in,ArrayList<String>res,String ans,int n){
        if(in==n-1){
            ans=ans+s.charAt(in);
            res.add(ans);
            return;
        }
        getHelper(s,in+1,res,ans+s.charAt(in),n);
        getHelper(s,in+1,res,ans+s.charAt(in)+' ',n);
    }
}
