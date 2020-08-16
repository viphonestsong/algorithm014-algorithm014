package HomeWork;

/**
 * 283. 移动零
 * 实现swap方法,来将0和后续位置进行交换
 */
public class MoveZeroes2 {

    /*public static void main(String[] args) {
        int[] arr= new int[]{0,1,0,3,12};
        moveZeroes(arr);
    }*/

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (0 != nums[i]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx++] = temp;
            }
        }
    }
}
