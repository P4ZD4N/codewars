def get_count(sentence):
    sentence_to_lowercase = sentence.lower()
    vowel_counter = 0

    for i in sentence_to_lowercase:
        if (i == "a" or i == "e" or i == "i" or i == "o" or i == "u"):
            vowel_counter += 1
        else:
            continue

    return vowel_counter

print(get_count("Hello World!"))
print(get_count("Vowel Counter"))