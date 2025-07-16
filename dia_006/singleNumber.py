nums = [4,1,2,1,2, 2, 2, 2, 2, 4, 4, 4, 8]

def singleNumber1(nums):
    lista = nums[:]
    for i in range(len(nums)):
        if nums[i] in nums[i+1:] or nums[i] in nums[:i]:
            lista.remove(nums[i])
    return sum(lista)

def singleNumber2(nums):
    mapa = {}

    for i in range(len(nums)):
        if nums[i] in mapa:
            mapa[nums[i]] = counter + 1
        else:
            counter = 1
            mapa[nums[i]] = counter
            
    for i, item in mapa.items():
        if item == 1:
            return i

     

print(singleNumber1(nums))


