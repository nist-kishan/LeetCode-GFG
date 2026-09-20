var findMedianSortedArrays = function(nums1, nums2) {
    if (nums1.length > nums2.length) {
        [nums1, nums2] = [nums2, nums1];
    }

    let m = nums1.length;
    let n = nums2.length;
    let left = 0, right = m;

    while (left <= right) {
        let cut1 = Math.floor((left + right) / 2);
        let cut2 = Math.floor((m + n + 1) / 2) - cut1;

        let l1 = cut1 === 0 ? -Infinity : nums1[cut1 - 1];
        let r1 = cut1 === m ? Infinity : nums1[cut1];

        let l2 = cut2 === 0 ? -Infinity : nums2[cut2 - 1];
        let r2 = cut2 === n ? Infinity : nums2[cut2];

        if (l1 <= r2 && l2 <= r1) {
            if ((m + n) % 2 === 0) {
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
            }
            return Math.max(l1, l2);
        }

        if (l1 > r2) {
            right = cut1 - 1;
        } else {
            left = cut1 + 1;
        }
    }
};