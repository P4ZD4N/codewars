def flatten(*args):
    list_of_elements = [element for element in args]
    list_of_elements_aux = []
    while len(
            [
                element
                for element in list_of_elements
                if isinstance(element, list)
            ]
    ) != 0:
        for element in list_of_elements:
            if isinstance(element, list):
                list_of_elements_aux.extend(element)
            else:
                list_of_elements_aux.append(element)
        list_of_elements = list_of_elements_aux.copy()
        list_of_elements_aux.clear()
    return list_of_elements
print(flatten([[[[[2]]]]], 'a', ['b', 2], 3, None, [3], [2], [[4]]))