def divide_number_by_60(number):
    return int(number / 60)
def calculate_remainder_when_divided_by_60(number):
    return int(number % 60)
def make_readable(seconds):
    if seconds > 359999:
        return "Function takes only values less than or equal to 359999 as an argument"
    else:
        readable_format_list = []

        seconds_in_readable_format = calculate_remainder_when_divided_by_60(seconds)
        minutes_in_readable_format = calculate_remainder_when_divided_by_60(
                divide_number_by_60(seconds - seconds_in_readable_format)
            )
        hours_in_readable_format = divide_number_by_60(divide_number_by_60(seconds))

        readable_format_list.append(seconds_in_readable_format)
        readable_format_list.append(minutes_in_readable_format)
        readable_format_list.append(hours_in_readable_format)

        readable_format_list.reverse()

        readable_format = "{:0>2}:{:0>2}:{:0>2}".format(
            readable_format_list[0],
            readable_format_list[1],
            readable_format_list[2]
        )

        return readable_format

print(make_readable(46474))