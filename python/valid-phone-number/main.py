def valid_phone_number(phone_number):
    phone_number_len = len(phone_number)
    if phone_number_len == 14:
        if phone_number[0] == "(" and phone_number[4] == ")" and phone_number[5] == " " and phone_number[9] == "-":
            if phone_number[1:4].isdigit() and phone_number[6:9].isdigit() and phone_number[10:14].isdigit():
                return True
            else:
                return False
        else:
            return False
    else:
        return False