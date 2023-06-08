
public class EvenDigits {
    public static void main(String[] args) {
        int nums[] = { 2, 14, 18, 22 ,18};
        Solution solution = new Solution();

        System.out.print(solution.containsDuplicate(nums));
    }

    // public static int evenDigits(int value) {
    // if (value == 0) {
    // return 0;
    // }
    // int remainder = value % 10;
    // if (remainder % 2 == 0) {
    // System.out.println(evenDigits(value / 10) * 10 + (remainder));
    // return evenDigits(value / 10) * 10 + (remainder);
    // }
    // else {
    // return evenDigits(value / 10);
    // }
    // }

}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        if (nums.length == 1) {
            result = false;
            return result;
        }

        int round = 0;
        for (int comp = 0; comp < nums.length; comp++){
            for (int n = round + 1 ; n < nums.length; n++){
                if (nums[comp] == nums[n]) {
                    result = true;
                }
                
            }

            round++;
        }

        return result;
    }
}