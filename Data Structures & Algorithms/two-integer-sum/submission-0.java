class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> hmList = new HashMap<>();
      for(int i=0; i<nums.length; i++){
        hmList.put(nums[i], i);
      }

      for(int i=0; i<nums.length; i++){
         int diff = target - nums[i];

         if(hmList.containsKey(diff) && hmList.get(diff) != i){
            return new int[]{i, hmList.get(diff)};
         }
      }

      return new int[0];
    }
}
