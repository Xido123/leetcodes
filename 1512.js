/**
 * @param {number[]} nums
 * @return {number}
 */

var numIdenticalPairs = function(nums) {
    let x = 0;
    for (let i = 0; i < nums.length - 1; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                x++;
            }
        }
    }
    return x
};
let arr = [];
for (let i = 0; i < 50000; i++) {
    arr.push(i);
}
var t0 = new Date();
numIdenticalPairs(arr);
var t1 = new Date();
console.log("Call to doSomething took " + (t1 - t0) + " milliseconds.");