def get_count(sentence):
    sentence_to_lowercase = sentence.lower()
    vowel_counter = 0
    for letter in sentence_to_lowercase:
        if letter in ["a", "e", "i", "o", "u"]:
            vowel_counter += 1
    return vowel_counter