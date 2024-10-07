import random

def slightly_random_array(n, chunk_size=3):
    # Create an array with numbers from 1 to n
    array = list(range(1, n+1))
   
    for i in range(0, n, chunk_size):
        end = min(i + chunk_size, n)
        chunk = array[i:end]
        random.shuffle(chunk)
        array[i:end] = chunk
    
    return array

slightly_random = slightly_random_array(10)

print(slightly_random)