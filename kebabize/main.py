def kebabize(st):
    if st.isdigit():
        return ""
    elif st.isupper():
        return "-".join(list(st.lower()))
    else:
        st_to_list = []
        for letter in st:
            if letter.isupper():
                if st.index(letter) == 0:
                    st_to_list.append(letter.lower())
                else:
                    st_to_list.append("-")
                    st_to_list.append(letter.lower())
            else:
                st_to_list.append(letter)
        st_to_list = [letter for letter in st_to_list if not letter.isdigit()]
        return "".join(st_to_list)
print(kebabize("MZ763ZGef8p47IkbVYbalZC178Ea2FF"))