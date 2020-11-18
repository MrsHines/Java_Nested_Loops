#For Loop Labs

## Program #1: 
- Complete the method triLet1(int num, String let).  
- Given two parameters, triLet1 should return a String that when printed will print a triangle of the letter that is num characters tall and wide.  It should begin with one character on the first line and end with num characters on the last line. 
- Example:  triLet1(3, A) should return A\nAA\nAAA. Which would print like when the method is called in a print statement in the main method:

- A
- AA
- AAA

## Program #2:
- Complete the method triLet2(int num, String let).  
- Given two parameters, triLet2 should return a String that when printed will print a triangle of the letter that is num characters tall and wide.  It should begin with num characters on the first line and end with one character on the last line. 
- Example:  triLet1(3, A) should return AAA\nAA\nA. Which would print like when the method is called in a print statement in the main method:
AAA

AA

A


## Program #3:
- Complete the method triLet3(int num, String let).  
- Given two parameters, triLet3 should return a String that when printed will print a triangle of the letter that is num characters tall and wide.  It should begin with one character on the first line and end with num characters on the last line. 
- The triangle should be right justified instead of left justified.
- Example:  triLet1(3, A) should return "  A\n AA\nAAA". Which would print like when the method is called in a print statement in the main method:
  A
 AA
AAA

## Program #4:
- Complete the triples(int num) method.
- Given a number, use nested loops to generate all Pythagorean triples from 1 up to num.  
- Hints: 
  - You will need three nested loops and at least one if statement. 
  - For three numbers to be a triple, they must satisfy several requirements:
      - a^2 + b^2 = c^2
      - if a is odd, b must be even and if a is even then b must be odd
      - for any a/b combination, c will be odd
      - The Greatest Common Factor of a, b, and c must be no greater than 1
- You will want to write an additional method for GreatestCommonFactor to help keep your code organized.  This method will require 1 loop and an if statement.
-Example: triples(25) will return "3 4 5 \n5 12 13 \n7 24 25" which will print like
3 4 5
5 12 13
7 24 25

## Program #5
- Complete the box(int num) method.
- Given a parameter, box will return a String that when printed will display a rectangle that is num + 1 characters wide and num characters long.  It will be made out of half * and half # in triangle patterns.
- Example: box(4) will produce "****#\n***##\n**###\n*####"  which would print like the following when the method is called in a print statement in the main method
****#
***##
**###
*####
  
## Program #6
- Complete the letAndNum(char let, int num) method.
- Given two parameters, letAndNum should return a String that when printed will print a triangle of num squares of letters that begin at num X num size and decrease by 1.  The letter should increase by one for each square as well. 
- Example:  letAndNum('A', 4) should return "AAAA BBB CC D \nAAAA BBB CC \nAAAA BBB \n AAAA"  This would look like the following when the method is called in a print statement in the main method:
AAAA BBB CC D
AAAA BBB CC
AAAA BBB
AAAA
- Hints: 
   - Get the shape first, then worry about changing letters.
   - This requires 3 nested loops
   - Think about what should happen if the letters reach Z.  What comes after that?
