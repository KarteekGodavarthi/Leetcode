import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombination {
    public static void main(String[] args) throws Exception {
        System.out.println(letterCombinations("234"));
    }

    
    static List<String> finalList;
    public static List<String> letterCombinations(String digits) {
        
        String[] strArr = {"0","1","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        finalList = new ArrayList<>();
        if(digits.length() == 0)
            return finalList;
        finalList.add("");
        
        letterComb(digits, strArr);
        return finalList;
    }
    
    public static void letterComb(String digits, String[] strArr){
        if(digits.length() == 0)
            return;
        
        char currentChar = digits.charAt(digits.length()-1);
        
        letterComb(digits.substring(0,digits.length()-1), strArr);
        
        List<String> tempList = new ArrayList<>();
        
        for(int i = 0; i < finalList.size();i++){
            char[] temp = strArr[Integer.parseInt(String.valueOf(currentChar))].toCharArray();
            for(int j = 0; j < temp.length; j++){
                tempList.add(finalList.get(i) + String.valueOf(temp[j]));
            }
        }
        
        finalList = tempList;
        
        return;
    }
}
