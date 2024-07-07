package _42_Trapping_Rain_Water;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(new TrappingRainWater().trap(new int[]{1,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(new TrappingRainWater().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(new TrappingRainWater().trap(new int[]{4,2,0,3,2,5}));
    }

    private int trap(int[] height) {
        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if(leftMax <= rightMax){
                volume += (leftMax - height[left]);
                left++;
            }else{
                volume += (rightMax - height[right]);
                right--;
            }
        }

        return volume;
    }
}
