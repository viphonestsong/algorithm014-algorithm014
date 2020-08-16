package DailyWork.MoveZeroes;

/**
 * 283. 移动零
 * 定义指针，遍历插入不为0的元素, 最后将所有后续元素设为0
 * 常犯错误: 26行 nums[i] 不要写成 nums[idx]
 */

public class MoveZeroes1 {

    /*public static void main(String[] args) {
        int[] arr= new int[]{0,1,0,3,12};
        moveZeroes(arr);
    }*/

    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length ==0) return;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num != 0){
                nums[idx++] = num;
            }
        }
        for (int i = idx; i < nums.length; i++) {
             nums[i] = 0;
        }
    }

}
