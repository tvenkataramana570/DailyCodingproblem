'''
Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.
'''
import random

def pick(big_stream):
    random_element = None

    for i, e in enumerate(big_stream):
        if i == 0:
            random_element = e
        elif random.randint(1, i + 1) == 1:
            random_element = e
    return random_element
print(pick([1,2,3,4,5,6,7]))
