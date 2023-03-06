import string
def pig_it(text):
    punctuation_marks = string.punctuation
    punctuation_mark = None
    punctuation_mark_index = None
    text_split = text.split()
    text_new = []
    for i in range(len(text_split)):
            text_new.append(text_split[i][1:] + text_split[i][0] + "ay")
    for word in text_new:
        for letter in word:
            if letter in punctuation_marks:
                punctuation_mark = letter
                punctuation_mark_index = text_new.index(word)
            else:
                continue
    if punctuation_mark == None:
        return " ".join(text_new)
    else:
        text_new[punctuation_mark_index] = punctuation_mark
        return " ".join(text_new)