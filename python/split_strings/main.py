def solution(sentence):
    if sentence == "":
        return []
    else:
        letters_in_sentence = list(sentence)
        if len(letters_in_sentence) % 2 != 0:
            letters_in_sentence.append("_")
        i = 2
        while i < len(letters_in_sentence):
            letters_in_sentence.insert(i, ' ')
            i += 3
        return "".join(letters_in_sentence).split(" ")