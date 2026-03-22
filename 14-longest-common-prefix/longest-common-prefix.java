class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return"";
        String fir=strs[0];
        for(int i=0;i<fir.length();i++){
            char sec=fir.charAt(i);
            for(int j=1;j< strs.length;j++){
                if((i>=strs[j].length()) || (sec!=strs[j].charAt(i))){
                    return fir.substring(0,i);
                }
            }

        }
    return fir;
    }
}