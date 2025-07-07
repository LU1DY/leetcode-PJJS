def two_sum(nums, target):
    resultado = []
    ignore = 0.1
    while len(resultado) != 2:
        for i in range(len(nums)):
            if nums[i] > target or nums[i] == ignore:
                pass
            else:
                resultado.append(i)
                if len(resultado) == 2 and nums[resultado[0]] + nums[resultado[1]] != target:
                    ignore = resultado.pop(0)
    return resultado


nums = [3, 4, 2]
target = 6

resultado = two_sum(nums, target)
print(resultado)
