def rests(x):
    list_of_rests = []
    if x != 0 and x >= 16 and 255 >= x:
        while x != 0:
            x_divided_by_16 = x // 16
            rest_of_division = x % 16
            list_of_rests.append(rest_of_division)
            x = x_divided_by_16
    elif 15 >= x and x >= 1:
        list_of_rests.append(x)
        list_of_rests.append(0)
    elif x > 255:
        for i in range(2):
            list_of_rests.append(15)
    else:
        for i in range(2):
            list_of_rests.append(0)
    list_of_rests.reverse()
    return list_of_rests
def checking(list_of_rests):
    hex_dict = {10: "A", 11: "B", 12: "C", 13: "D", 14: "E", 15: "F"}
    for digit in list_of_rests:
        index_of_digit = list_of_rests.index(digit)
        if digit in hex_dict:
            list_of_rests[index_of_digit] = hex_dict[digit]
    return list_of_rests
def rgb(r, g, b):
        list_of_rests = []
        list_of_rests.extend(checking(rests(r)))
        list_of_rests.extend(checking(rests(g)))
        list_of_rests.extend(checking(rests(b)))
        for digit in list_of_rests:
            index_of_digit = list_of_rests.index(digit)
            if type(digit) == int:
                list_of_rests[index_of_digit] = str(digit)
        return "".join(list_of_rests)