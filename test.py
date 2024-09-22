from numpy import random

# panjang_array10 = 10
panjang_array100 = 100
# panjang_array1000 = 1000

# array10 = array_acak = [random.randint(1, 11) for _ in range(panjang_array10)]
array100 = array_acak100 = [random.randint(1, 101) for _ in range(panjang_array100)]
# array1000 = array_acak1000 = [random.randint(1, 1001) for _ in range(panjang_array1000)]

# random.shuffle(array10)
random.shuffle(array_acak100)
# random.shuffle(array_acak1000)


# print(array10)
print(array100)
# print(array1000)

