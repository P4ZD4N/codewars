# DESCRIPTION
Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
<br><b>
Your task is to write a function maskify, which changes all but the last four characters into '#'.

# EXAMPLES
Maskify.Maskify("4556364607935616"); // should return "############5616"
<br>
Maskify.Maskify("64607935616");      // should return "#######5616"
<br>
Maskify.Maskify("1");                // should return "1"
<br>
Maskify.Maskify("");                 // should return ""
<br><br>
Maskify.Maskify("Skippy");                                   // should return "##ippy"
<br>
Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
