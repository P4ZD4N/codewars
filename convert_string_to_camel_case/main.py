import re
def to_camel_case(text):
    splitted_text = re.split('-|_', text)
    splitted_text_camel_case = []
    if text != "":
        if splitted_text[0][0].isupper():
            splitted_text_camel_case = [word.capitalize() for word in splitted_text]
        else:
            for word in splitted_text:
                if splitted_text[0] == word:
                    splitted_text_camel_case.append(word)
                else:
                    splitted_text_camel_case.append(word.capitalize())
    else:
        return text
    return "".join(splitted_text_camel_case)
print(to_camel_case("The_Stealth_Warrior"))