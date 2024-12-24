class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        generate(temp,res,nums);
        return res;
        }
    public void generate(List<Integer>temp,List<List<Integer>>res,int[] nums){
             if(temp.size()==nums.length){
                res.add(new ArrayList<>(temp));
                return;
             }
             for(int i=0;i<nums.length;i++){
                if(!temp.contains(nums[i])){
                    temp.add(nums[i]);
                    generate(temp,res,nums);
                    temp.remove(temp.size()-1);
                }
             }
    }

}