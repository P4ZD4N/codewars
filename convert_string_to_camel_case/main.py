import re
def to_camel_case(text):
    splitted_text = re.split('-|_', text)
    splitted_text_camel_case = []
    if text != "":
        if splitted_text[0][0].isupper():
            for word in splitted_text:
                splitted_text_camel_case.append(word.capitalize())
        else:
            for word in splitted_text:
                if splitted_text[0] == word:
                    splitted_text_camel_case.append(word)
                    continue
                else:
                    splitted_text_camel_case.append(word.capitalize())
    else:
        return text
    camel_case_text = "".join(splitted_text_camel_case)
    return camel_case_text