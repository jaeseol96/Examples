public class RecursionPractice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,10};
        System.out.println(checkSorted(arr, arr.length-1));
    }

    public static boolean checkSorted(int[] arr, int num) {
        boolean sorted = true;
        if (num == 1) {
            return sorted;
        } else {
            sorted = arr[num-1] < arr[num];
            checkSorted(arr,num-1);
        }
        return sorted;

    }

    public static boolean checkPalindrome(String s) {
        boolean isPalindrome = true;
        if (s.length() <= 1) {
            return isPalindrome;
        } else {
            if (s.charAt(0) != s.charAt(s.length()-1)) {
                isPalindrome = false;
            }
            checkPalindrome(s.substring(1,s.length()-1));
        }
        return isPalindrome;
        
    }
}