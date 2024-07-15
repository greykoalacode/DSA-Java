package greedy;

public class FurthestBuilding {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int curr = heights[0];
        for(int i=1; i < heights.length; i++){
            if(curr < heights[i]){
                int neededBricks = heights[i]-curr;

            }
        }
    }

    public static void main(String[] args) {
        int[][] heights = {{4,2,7,6,9,14,12}, {4,12,2,7,3,18,20,3,19}, {14,3,19,3}};
        int[] bricks = {5,10,17};
        int[] ladders = {1, 2, 0};
        for(int i=0; i< heights.length; i++){
            System.out.println(furthestBuilding(heights[i], bricks[i], ladders[i]));
        }
    }
}
