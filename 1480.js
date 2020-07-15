/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    let nums2 = [];
    let tem = 0;
    for (let key in nums) {
        tem += nums[key];
        nums2.push(tem)
    }

    return nums2;
};
let nums = [1, 2, 3, 4];
console.log(runningSum(nums));