package arrays;

import java.util.Stack;

public class CharArrayMatch {
    public static void main(String[] args) {
        String s1 = "(";
        String s2 = ")";
        String s3 = "(())";
        System.out.println(checkClosedBrackets(s1));

        int[] nums  = {5,8,8,8,8,10};
        int target = 8;
        System.out.println(giveFirstLastPosition(nums, target));

    }
 // time - O(n), space - O(n)
    private static boolean checkClosedBrackets(String s){
        boolean isClosed = false;
        Stack<Character> brackets = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                brackets.push(s.charAt(i));
            } else {
                if(brackets.isEmpty()){
                    return false;
                }
                else if(brackets.peek().equals('(')){
                    brackets.pop();
                }
            }
        }
        if(brackets.isEmpty()){
            isClosed = true;
        }
        return isClosed;
    }

    // time - O(logn) and space - O(1)
    private static int giveFirstLastPosition(int[] arr, int target){
        int[] pos = {-1, -1};
        int len = arr.length;
        int start = 0, end = len-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                if(pos[0] == -1){
                    pos[0] = Math.min(mid, pos[0]);
//                    break;
                }
            }
            if(arr[mid] <= target){
                start = mid;
            } else {
                end = mid-1;
            }
        }
        return pos[0];
    }


}
