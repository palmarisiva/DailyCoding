class FindTargetBinarySearch2 {
    public int search(int[] nums, int target) {
          int start=0,mid=0, end = nums.length-1;
          while(start <= end){
              mid = start+(end-start)/2;
              if(target == nums[mid]){
                  return mid;
              } else if(target < nums[mid]){
                  end = mid-1;
              } else if(target> nums[mid]) {
                  start = mid+1;
              }
          }
            return -1;
        
    }
}
