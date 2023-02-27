#DESCRIPTION
<br>
For this exercise you will create a global flatten method. The method takes in any number of arguments and flattens them into a single
<br>
array. If any of the arguments passed in are an array then the individual objects within the array will be flattened so that they
<br>
exist at the same level as the other arguments. Any nested arrays, no matter how deep, should be flattened into the single array
<br>
result.
<br><br>
The following are examples of how this function would be used and what the expected results would be:
<br><br>
flatten(1, [2, 3], 4, 5, [6, [7]]) # returns [1, 2, 3, 4, 5, 6, 7]
<br>
flatten('a', ['b', 2], 3, None, [[4], ['c']]) # returns ['a', 'b', 2, 3, None, 4, 'c']
