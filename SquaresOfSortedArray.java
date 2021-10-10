class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left=0, right = n-1, sq = 0;
        int[] result = new int[n];
        for(int i = n-1;i>=0;i--){
            sq = 0;
            if(Math.abs(nums[right])>Math.abs(nums[left]) ) {
                sq = nums[right];
                right--;
            } else {
                sq = nums[left];
                left++;
            }
            result[i] = sq * sq;
        }
        return result; 
        
    }
}
