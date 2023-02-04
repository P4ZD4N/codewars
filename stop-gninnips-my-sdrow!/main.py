def spin_words(sentence):
    words_in_sentence = sentence.split()
    words_with_reversed = []

    for word in words_in_sentence:
        if len(word) >= 5:
            words_with_reversed.append(word[::-1]) # reverse string with [::-1]
        else:
            words_with_reversed.append(word)

    return ' '.join(map(str, words_with_reversed))