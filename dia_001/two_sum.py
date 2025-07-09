def two_sum(nums, target):
    resultado = []
    for i, item in enumerate(nums):
        complemento = target - item
        if complemento in nums:
            for x, valor in enumerate(nums):
                if x == i or complemento != valor:
                    continue
                else:
                    resultado = [i, x]
                    break
            
    return resultado


nums = [3,2,4]
target = 6

resultado = two_sum(nums, target)
print(resultado)

