//一遍哈希表
//在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。
//如果它存在，那我们已经找到了对应解，并立即将其返回。
class Solution {
    public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
            }
        throw new IllegalArgumentException("No two sum solution");
    }
}
