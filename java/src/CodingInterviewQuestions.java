import groovy.console.ui.AstBrowser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
public String longestCommonPrefix(String[] str) {
    String result = "";
    for(int i = 0; i<str.length-1; i++){
        if(str[i].charAt(i) == str[i+1].charAt(i)){
            result = result+str[i].charAt(i);
        }else{
            result = "";
        }
    }
    return result;
}
//-------------------------------------- Match brackets--------------------------------------
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

//--------------------------------------MergeTwoSortedLists----------------------------------
public LinkedListNode mergeTwoLists(LinkedListNode list1, LinkedListNode list2) {
    if(list1 == null){
        return list2;
    }
    if(list2 == null){
        return list1;
    }
    if(list1.getData() >= list2.getData()){
        list2.setNext(mergeTwoLists(list1,list2.getNext()));
        return list2;
    }
    else{
        list1.setNext(mergeTwoLists(list1.getNext(), list2));
        return list1;
    }
}

public void productsStartingWithLetters(String [] str){

        for (int i = 0; i<str.length; i++){
            switch (str[i].charAt(0)){
                case 'A':
                    System.out.print(" { "+str[i]+" } ");
                    break;

                case 'E':
                    System.out.print(" { "+str[i]+" } ");
                    break;

                case 'I':
                    System.out.print(" { "+str[i]+" } ");
                    break;
                case 'O':
                    System.out.print(" { "+str[i]+" } ");
                    break;
                case 'U':
                    System.out.print(" { "+str[i]+" } ");
                    break;

                default:
                    break;
            }
        }
}
public void charLength(String [] str){
        int count ;
        for (int i = 0; i<str.length; i++){
            count = 0;
            for (int j = 0; j<str[i].length();j++){
                count++;
                if (count>5){
                    System.out.print(" { "+str[i]+" } ");
                    break;
                }
            }
        }
}

public void stringCounter(String str){
//        String[] spliter = str.split("");
//    System.out.println(Arrays.toString(spliter));
    int digitCount = 0;
    int letterCount = 0;
    int whiteSpaceCount = 0;
    for (int i = 0; i<str.length(); i++){
        if (Character.isDigit(str.charAt(i))){
            digitCount++;
        }else if (Character.isAlphabetic(str.charAt(i))){
            letterCount++;
        }else{
            whiteSpaceCount++;
        }
    }
    System.out.println("Letters => "+letterCount);
    System.out.println("Numbers => "+digitCount);
    System.out.println("Special Characters (Including Spaces) =>"+whiteSpaceCount);


}
}
