def move_zeros(lst):
    for element in lst:
        if element == 0:
            lst.remove(element)
            lst.append(0)
        else:
            continue
    return lst