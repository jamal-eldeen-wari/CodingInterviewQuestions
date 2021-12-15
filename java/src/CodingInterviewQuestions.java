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


}
