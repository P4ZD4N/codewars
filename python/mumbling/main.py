def accum(sentence):
    if contains_only_letters(sentence):
        sentence_length = len(sentence)
        strings = []
        for char_position in range(sentence_length):
            how_many_times = char_position
            string_first_letter = sentence[char_position].upper()
            string_end = sentence[char_position].lower() * how_many_times
            string = string_first_letter + string_end
            strings.append(string)
        return "-".join(strings)
    else:
        return "Sentence contains numbers or special characters!"

def contains_only_letters(sentence):
    numbers = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    numbers_booleans = [
        (True) if number in sentence
        else (False)
        for number in numbers
    ]
    special_characters = ["~", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+",
                          "[", "]", "{", "}", ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?", "\\", "|"]
    special_characters_booleans = [
        (True) if special_character in sentence
        else (False)
        for special_character in special_characters
    ]

    if any(numbers_booleans) or any(special_characters_booleans):
        return False
    else:
        return True