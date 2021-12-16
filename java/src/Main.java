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

//        -------------------------LongestCommonPrefix-------------------------------------
        String [] str = new String[]{"flower","flow","flight"};
        System.out.println(codingInterviewQuestions.longestCommonPrefix(str));

//        -------------------------StartingWithLetters-------------------------------------
//        [“Apple”, “Banana”, “Cucumber”, “Watermelon”, “Ice-cream”, “Orange”, “Eggplant”,
//“Egg”]
        String [] words = new String[]{"Apple", "Banana","Cucumber","Watermelon","Ice-cream","Orange","Eggplant","Egg" };
        System.out.println("productsStartingWithLetters");
        codingInterviewQuestions.productsStartingWithLetters(words);
        System.out.println();
        System.out.println("charLength");
        codingInterviewQuestions.charLength(words);

//        ----------------------Logic3------------------------------------------
        String str1 = "THis & * 12345678z_k ";
        System.out.println();
        codingInterviewQuestions.stringCounter(str1);



    }
}
