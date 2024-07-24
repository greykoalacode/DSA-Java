package arrays;

//        Input: tickets = [2,3,2,4], k = 2
//
//        Output: 6

// 0 1 0 2

// 1: 1 3 2 4
// 2: 1 2 2 4
// 3: 1 2 1 4
// 4: 1 2 1 3
// 5: 0 2 1 3
// 6: 0 1 1 3
// 7: 0 1 0 3

// 4 1 1 1
// 4 0 1 1
// 4 0 0 1
// 4 0 0 0
// 3 0 0 0
// 2 0 0 0
// 1 0 0 0
// 0 0 0 0

// t=4s -> 1,2,1,3
// t= 8s -> 0,1,0,2

//        Input: tickets = [5,1,1,1], k = 0
//
//        Output: 8
public class QueueProblem {

    public static int timeTakenPerPerson(int[] arr, int k){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(i < k){
                ans += Math.min(arr[i], arr[k]);
            } else if(i > k){
                ans += Math.min(arr[i], arr[k]-1);
            } else {
                ans += arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {2,3,2},
                {5,1,1,1}
        };
        int[] positions = {2,0};
        for(int i=0; i< inputs.length; i++){
            System.out.println(timeTakenPerPerson(inputs[i], positions[i]));
        }
    }
}
