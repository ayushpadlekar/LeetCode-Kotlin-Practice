// 88. Merge Sorted Array

// 3 pointers, While loops
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        
        var last = m + n - 1
        var n1i = m-1
        var n2i = n-1

        while(n1i >= 0 && n2i >= 0) {
            if(nums1[n1i] >= nums2[n2i]) {
                nums1[last] = nums1[n1i]
                last--
                n1i--
            } else {
                nums1[last] = nums2[n2i]
                last--
                n2i--
            }
        }
        while(n2i >= 0) {
            nums1[last] = nums2[n2i]
            last--
            n2i--
        }

        // for(i in 0 until last) {
        //     if(nums1[n1i] < nums2[n2i]) {
        //         nums1[last] = nums2[n2i]
        //         n2i--
        //         last--
        //     } else if(nums1[n1i] > nums2[n2i]) {
        //         nums1[last] = nums1[n1i]
        //         last--
        //         nums1[last] = nums2[n2i]
        //     }
        // }
    }
}
