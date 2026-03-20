class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap< Character,Integer> map= new HashMap<>();
        //put keys and values
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);}
            else{map.put(c,1);}
        }

        //subtract if encounter
        for(char c:t.toCharArray()){
            if(!map.containsKey(c)||map.get(c)==0){
                return false;
            }
            else{
                map.put(c,map.get(c)-1);
            }
            
        }    
        return true;
    }
}