def to_underscore(PascalCaseString):
    letters = []
    if type(PascalCaseString) == str:
        for letter in PascalCaseString:
            if letter.isupper():
                letters.append("_")
                letters.append(letter.lower())
            else:
                letters.append(letter)
        letters.remove("_")
        return "".join(letters)
    else:
        PascalCaseString = str(PascalCaseString)
        return PascalCaseString