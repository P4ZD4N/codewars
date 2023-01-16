def array_diff(list_a, list_b):

    list_c = []
    list_d = []

    for element_of_b in list_b:
        if element_of_b in list_a:
            list_c.append(element_of_b)

    for element_of_a in list_a:
        if element_of_a not in list_c:
            list_d.append(element_of_a)

    return list_d

print(array_diff([1,2,2,2,2,2,3,4,5,3,4,3,2,2,4,6,8,5], [2,4,80]))