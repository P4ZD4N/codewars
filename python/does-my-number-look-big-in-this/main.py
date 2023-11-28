def narcissistic(digit):
    given_digit = digit
    digit_to_str = str(digit)
    how_many_digits = len(digit_to_str)
    sum_of_powers = 0
    for digit in digit_to_str:
        sum_of_powers += int(digit) ** how_many_digits
    sum_of_powers = int(sum_of_powers)
    if sum_of_powers == given_digit:
        return True
    else:
        return False

