def digital_root(number):
    if number >= 0:
        number_to_str = str(number)
        while True:
            digits_in_number = [
                int(n)
                for n in number_to_str
            ]
            sum_of_digits = sum(digits_in_number)
            number_to_str = str(sum_of_digits)
            if len(str(sum_of_digits)) == 1:
                break
            else:
                continue
        return sum_of_digits
    else:
        return "Error"