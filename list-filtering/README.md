# Description
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

# Examples
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
<br>
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
<br>
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)