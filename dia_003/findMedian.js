let nums1 = [0, 0];
let nums2 = [0, 0];

function findMedianSortedArrays(nums1, nums2) {
  const nums = [...nums1, ...nums2];
  nums.sort((a, b) => a - b);
  if (nums.length % 2 === 0) {
    let meio = Math.floor(nums.length / 2);
    let meio1 = meio - 1;
    return (nums[meio] + nums[meio1]) / 2;
  } else {
    let meio = Math.floor(nums.length / 2);
    return nums[meio];
  }
}

console.log(findMedianSortedArrays(nums1, nums2));
