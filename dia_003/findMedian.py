nums1 = [0, 0]
nums2 = [0, 0]

def findMedianSortedArrays(nums1, nums2):
    nums1 += nums2
    nums1.sort()
    if len(nums1) % 2 == 0:
        meio = len(nums1) // 2
        meio1 = meio - 1
        mediana = (nums1[meio] + nums1[meio1]) / 2
    else:
        meio = len(nums1) // 2
        mediana = nums1[meio]
    return mediana

print(findMedianSortedArrays(nums1, nums2))