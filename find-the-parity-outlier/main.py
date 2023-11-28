def find_outlier(integers):
    integers_booleans = [
        integer % 2 == 0
        for integer in integers
    ]
    even_integers = integers_booleans.count(True)
    odd_integers = integers_booleans.count(False)
    if even_integers > odd_integers:
        find_odd = [
            integer
            for integer in integers
            if not(integer % 2 == 0)
        ]
        return find_odd[0]
    else:
        find_even = [
            integer
            for integer in integers
            if integer % 2 == 0
        ]
        return find_even[0]