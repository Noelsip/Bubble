import random

panjang_array10 = 10000
# panjang_array100 = 1000
# panjang_array1000 = 1000

array_acak10 = [random.randint(1, 10001) for _ in range(panjang_array10)]
# array_acak100 = random.sample(range(1, 1001), panjang_array100)
# array_acak1000 = [random.randint(1, 1001) for _ in range(panjang_array1000)]

random.shuffle(array_acak10)
# random.shuffle(array_acak100)
# random.shuffle(array_acak1000)

print("Array setelah diacak:", array_acak10)
# print("Array setelah diacak:", array_acak100)
# print("Array setelah diacak:", array_acak1000)
