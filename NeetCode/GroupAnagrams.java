import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<List<String>>();

        // Prep the strs for comparison
        String[] sortedStrs = new String[strs.length];
        for (int i = 0; i < strs.length; i++)
        {
            // char array for sorting.
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            
            // Just gonna use strs[] for storage
            sortedStrs[i] = new String(charArray);
        }

        // Compare them now
        // HashMap to store based on key sorted string to a list of strings.
        HashMap<String, List<String>> keys = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++)
        {
            if (keys.get(sortedStrs[i]) != null)
            {
                List<String> bucket = keys.get(sortedStrs[i]);

                // Add this string to the bucket since it has the same key.
                bucket.add(strs[i]);
            }
            else
            {
                // Create the bucket 
                List<String> bucket = new ArrayList<String>();
                bucket.add(strs[i]);

                keys.put(sortedStrs[i], bucket);
            }
        }
         // Gather the results
        for (Map.Entry<String, List<String>> entry : map.entrySet())
        {
            List<String> bucket = entry.getValue();
            result.add(bucket);
        }

        return result;
    }
}

