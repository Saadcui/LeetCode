class Solution {
    public int[] getConcatenation(int[] nums) {
        int num = nums.length*2;
        int[] array = new int[num];
        int count = 0;
        for(int i = 0 ; i < array.length; i++){
            if( i < nums.length ){
                 array[i] = nums[i];
            }
            if(i >= nums.length){
                array[i] = nums[count];
                count++;
            }

        }
        return array;
    }
}
