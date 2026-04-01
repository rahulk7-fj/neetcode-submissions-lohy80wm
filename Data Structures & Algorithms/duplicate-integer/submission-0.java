class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hMap = new HashMap<>();

        for(int num : nums){
            
            if(hMap.containsKey(num)){
                return true;
            }
            hMap.put(num, 1);
        }

        return false;
    }
}