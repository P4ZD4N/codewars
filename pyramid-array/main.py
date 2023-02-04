def pyramid(number_of_arrays):
    pyramid = []
    if number_of_arrays >= 0:
        for number in range(number_of_arrays):
            auxiliary_array = []
            for index in range(number+1):
                auxiliary_array.insert(index, 1)
            pyramid.append(auxiliary_array)
        return pyramid
    else:
        return "error"