def solution(sentece):
    letters = []
    for letter in sentece:
        if letter.isupper():
            letters.append(" ")
            letters.append(letter)
        else:
            letters.append(letter)
    return "".join(letters)