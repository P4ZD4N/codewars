# DESCRIPTION

This is the first part of this kata series. Second part is here.
<br>
We want to create a simple interpreter of assembler which will support the following instructions:
<br><br>

- mov x y - copies y (either a constant value or the content of a register) into register x
  <br>
- inc x - increases the content of the register x by one
  <br>
- dec x - decreases the content of the register x by one
  <br>
- jnz x y - jumps to an instruction y steps away (positive means forward, negative means backward, y can be a register or a constant),
  <br>
  but only if x (a constant or a register) is not zero
  <br><br>
  Register names are alphabetical (letters only). Constants are always integers (positive or negative).
  <br><br>
  Note: the jnz instruction moves relative to itself. For example, an offset of -1 would continue at the previous instruction, while an
  <br>
  offset of 2 would skip over the next instruction.
  <br><br>
  The function will take an input list with the sequence of the program instructions and will execute them. The program ends when there
  <br>
  are no more instructions to execute, then it returns a dictionary (a table in COBOL) with the contents of the registers.
  <br>
  Also, every inc/dec/jnz on a register will always be preceeded by a mov on the register first, so you don't need to worry about
  <br>
  uninitialized registers.
  <br><br>
  Example
  <br><br>
  ["mov a 5"; "inc a"; "dec a"; "dec a"; "jnz a -1"; "inc a"]
  <br>
  visualized:
  <br>
  mov a 5
  <br>
  inc a
  <br>
  dec a
  <br>
  dec a
  <br>
  jnz a -1
  <br>
  inc a
  <br><br>
  The above code will:
  <br><br>
- set register a to 5,
  <br>
- increase its value by 1,
  <br>
- decrease its value by 2,
  <br>
- then decrease its value until it is zero (jnz a -1 jumps to the previous instruction if a is not zero)
  <br>
- and then increase its value by 1, leaving register a at 1
  <br>
  So, the function should return:
  <br><br>
  {'a': 1}
  <br><br>
  This kata is based on the Advent of Code 2016 - day 12
