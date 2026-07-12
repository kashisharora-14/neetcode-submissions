class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftmax[] = new int [height.length ];
        int rightmax[] = new int [height.length ];
        leftmax[0] = height[0];
        rightmax[height.length-1] = height[height.length - 1];

        for (int i = 1; i < height.length - 1; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        for (int j = height.length - 2; j >= 0; j--) {
            rightmax[j] = Math.max(rightmax[j + 1], height[j]);
        }
         int maxwater=0;

         for(int i=0;i<height.length-1;i++)
         {
            maxwater+=Math.min(leftmax[i],rightmax[i])-height[i];
         }

    return maxwater;
    }
}
