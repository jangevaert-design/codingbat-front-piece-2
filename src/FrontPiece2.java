public class FrontPiece2 {
  public int[] frontPiece(int[] nums) {
    int len = nums.length;
    int[] result = new int[2];

    if (nums.length <= 1) {
      return nums;
    } else {
      result[0] = nums[0];
      result[1] = nums[1];
      return result;
    }
  }
}
