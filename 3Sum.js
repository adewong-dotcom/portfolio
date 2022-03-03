function threeSum(nums){
    var result = [];
    if(nums.length < 3) return result; //Base Case

    let num = 0;
    
    for(let i = 0; i <nums.length/3; i++){
        for(let j = nums.length/3; j <nums.length*2/3; j++){
            for(let k = nums.length*2/3; k <nums.length; k++){
                const sum = nums[i] + nums[j] + nums[k];
                if(sum == 0 && i!= k && i!= j && k!=j){
                    console.log(nums[i] + ", " + nums[j] + ", " + nums[k]);
                    result[num] = [];
                    result[num][0] = nums[i];
                    result[num][1] = nums[j];
                    result[num][2] = nums[k];
                    num++;
                }
            }
        }
    }
    return result;
}