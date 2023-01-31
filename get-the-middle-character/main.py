def get_middle(str):
    str_len = len(str)
    str_len_half = int(str_len / 2)
    if str_len % 2 == 0:
        return str[str_len_half-1:str_len_half+1]
    else:
        return str[str_len_half]