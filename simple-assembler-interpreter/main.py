import re
def find_indices_of_spaces(instruction):
    space = " "
    indices = [
        index.start()
        for index in re.finditer(space, instruction)
    ]
    return indices
def simple_assembler(program):
    dictionary = {}
    for instruction in program:
        if instruction.startswith("mov"):
            indices = find_indices_of_spaces(instruction)
            dictionary.update(
                {instruction[indices[0]+1:indices[-1]]: instruction[indices[1]+1]}
            )
        elif instruction.startswith("inc"):
            indices = find_indices_of_spaces(instruction)
            register = instruction[indices[0]+1]
            dictionary.update(
                {register: int(dictionary[register])+1}
            )
        elif instruction.startswith("dec"):
            indices = find_indices_of_spaces(instruction)
            register = instruction[indices[0]+1]
            dictionary.update(
                {register: int(dictionary[register])-1}
            )
        elif instruction.startswith("jnz"):
            indicess = find_indices_of_spaces(instruction)
    return dictionary
print(simple_assembler(["mov a 5", "inc a", "dec a", "dec a", "jnz a -1", "inc a"]))