package strings;
import java.util.Arrays;

public class LongestCommonPrefix {
        public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        String firstString = strs[0];
        for(int j=0;j< firstString.length();j++){
            for(int i=1;i<strs.length;i++){
                if(firstString.charAt(j)!=strs[i].charAt(j)){
                    return firstString.substring(0,j);
                }
            }
        }
        return strs[0];
    }
}
