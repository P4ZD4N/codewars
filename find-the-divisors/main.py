def divisors(integer):
    divisors = []
    if integer > 1:
        for n in range(2, integer+1):
            if integer % n == 0:
                if integer == n:
                    break
                divisors.append(n)
        if len(divisors) > 0:
            return divisors
        else:
            return f"{integer} is prime"
    else:
        return f"{integer} isn't bigger than 1!"