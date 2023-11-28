import string
def order(sentence):
    words_in_sentence = sentence.split()
    sorted = []
    for word in words_in_sentence:
        for char in word:
            if char >= "1" and char <= "9":
                sorted.insert(int(char)-1, int(char)-1)
                break
    sorted.sort()
    for word in words_in_sentence:
        for char in word:
            if char.isdigit():
                sorted[int(char)-1] = word
    return " ".join(sorted)