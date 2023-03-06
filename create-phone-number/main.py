def create_phone_number(lst):
    if len(lst) == 10:
        first_part_of_number = "".join(str(element) for element in lst[0:3])
        second_part_of_number = "".join(str(element) for element in lst[3:6])
        third_part_of_number = "".join(str(element) for element in lst[6:])
        phone_number = f"({first_part_of_number}) {second_part_of_number}-{third_part_of_number}"
        return phone_number
    else:
        return "Incorrect length of list"