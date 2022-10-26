class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] output = s.split(" ");
        return output[output.length-1].length();
        
    }
}