def digitize(digit):
    digit_to_str = str(digit)
    array_of_digits = []
    for n in digit_to_str:
        n_to_int = int(n)
        array_of_digits.append(n_to_int)
    array_of_digits.reverse()
    return array_of_digits