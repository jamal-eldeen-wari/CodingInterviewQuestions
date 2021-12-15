import java.util.Stack;

public class CodingInterviewQuestions {

//    ------------------------------TWO SUM-------------------------------------------------------
//    Returns the index of the numbers that made the target;
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

//    ---------------------------Is Palindrome-------------------------------------------------------

    public boolean isPalindrome(int x) {
        int temp = x;
        int rem = 0;
        int rev = 0;

//         EdgeCase
        if(x<0){
            return false;
        }

        while(temp>0){
            rem = temp%10;
            rev = (rev*10)+rem;
            temp = temp/10;
        }
        return rev == x;

    }
//    ------------------------RomanInteger------------------------------------------------
public int romanToInt(String s) {
    String [] symbol = s.split("");
    int count = 0;

    for(int i = 0; i<symbol.length;i++){
        switch(symbol[i]){
            case "I":
                count = count+1;
                break;

            case "V":
                count = count+5;
                break;

            case "X":
                count = count+10;
                break;

            case "L":
                count = count+50;
                break;

            case "C":
                count = count+100;
                break;

            case "D":
                count = count+500;
                break;

            case "M":
                count = count+1000;
                break;

            default:
                break;
        }
    }
    return count;

}

// -------------------------------LongestCommonPrefix------------------------------------------
public String longestCommonPrefix(String[] strs) {
    String result = "";
    for(int i = 0; i<strs.length-1; i++){
        if(strs[i].charAt(i) == strs[i+1].charAt(i)){
            result = result+strs[i].charAt(i);
        }else{
            result = "";
        }
    }
    return result;
//    if (strs.length==0) return "";
//    String prefix=strs[0];
//    for (int i=1;i<strs.length;i++)
//    {
//        while(strs[i].indexOf(prefix)!=0)
//        {
//            prefix=prefix.substring(0,prefix.length()-1);
//        }
//
//    }
//    return prefix;



}
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top  = stack.pop();

                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == '[' && top != ']')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
