import math
def zeros(number):
    trailing_zeros = 0
    factorial = str(math.factorial(number))
    factorial_reverse = factorial[::-1]
    for next_number in factorial_reverse:
        if next_number == "0":
            trailing_zeros += 1
        else:
            break
    return trailing_zeros