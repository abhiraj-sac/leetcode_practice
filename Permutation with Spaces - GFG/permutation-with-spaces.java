//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String str){
           
        ArrayList<String>res=new ArrayList<>();
        getHelper(str,0,res,"",str.length());  Collections.sort(res);
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
    
