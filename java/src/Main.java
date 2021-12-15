import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("hello World");
        int[] num = new int[]{1,3,5,8};
        CodingInterviewQuestions codingInterviewQuestions = new CodingInterviewQuestions();
//        ------------------------TWO SUM--------------------------------------------------
        System.out.println(Arrays.toString(codingInterviewQuestions.twoSum(num, 8)));

//        -------------------------Is Palindrome-------------------------------------------
        System.out.println(codingInterviewQuestions.isPalindrome(121));

//       ---------------------------RomanInt-----------------------------------------------
        System.out.println(codingInterviewQuestions.romanToInt("III"));

    }
}
