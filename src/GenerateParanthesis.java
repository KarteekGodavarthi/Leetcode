import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParanthesis {
    public static void main(String[] args) throws Exception {
        generateParenthesis(3);
        return;
    }

    static Stack<Character> stack;
    static int left;
    static int right;
    static List<String> resultList ;
    public static List<String> generateParenthesis(int n) {
        left = n;
        right = n;
        stack = new Stack<>();
        resultList = new ArrayList<>();
        
        populateStack("", left, right);
        return resultList;
    }
    
    public static void populateStack(String finalString, int left, int right){
        if(left > right || left < 0 || right < 0){
            return;
        }
        if(left == 0 && right == 0){
            if(checkBalance(finalString)){
                resultList.add(finalString);
            }
        }
        populateStack(finalString + "(" , left - 1 , right);
        populateStack(finalString + ")", left , right - 1);
        
        return;
    }
    
    public static boolean checkBalance(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(')
                stack.push(str.charAt(i));
            else{
                if(stack.peek() == '(')
                    stack.pop();
                else
                    stack.push(str.charAt(i));
            }
        }
        if(stack.size() == 0)
            return true;
        else{
            stack.clear();
            return false;
        }
    }
}