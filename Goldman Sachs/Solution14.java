class Solution {
    // https://leetcode.com/problems/count-nice-pairs-in-an-array/
    public int countNicePairs(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
	int result = 0, key,mod = (int)1e9 + 7;
        for(int num:nums){
            key=num-res(num);
            if(map.containsKey(key)){
                result=(result+map.get(key))%mod;
            }
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return result;
    }
    int res(int i){
       
    int res = 0;
        while (i > 0) {
        res = res * 10 + i % 10;
        i /= 10;
        }
        return res;
    }
}