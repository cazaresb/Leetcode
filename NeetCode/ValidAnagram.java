import java.util.*;

class ValidAnagram{
    public boolean isValidAnagram(String s, String t){
        int n = s.length();
        int m = t.length();

        if (n != m) {
            return false;
        }

        HashMap<Character, Integer> frequencyS = new HashMap<>();
        HashMap<Character, Integer> frequencyT = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            if (frequencyS.get(s.charAt(i)) == null){
                frequencyS.put(s.charAt(i), 1);
            } else {
                frequencyS.put(s.charAt(i), frequencyS.get(s.charAt(i)) + 1);
            }

            if (frequencyT.get(t.charAt(i)) == null){
                frequencyT.put(t.charAt(i), 1);
            } else {
                frequencyT.put(t.charAt(i), frequencyT.get(t.charAt(i)) + 1);
            }
        }

        for(Character c : frequencyS.keySet()) {
            if(!frequencyS.get(c).equals(frequencyT.get(c))){
                return false;
            }
        }
        
        return true;

        

        
    }
}