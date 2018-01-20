# Review 2 Homework

#### 1. Magic 8 Ball

Write a program that simulates a Magic 8 Ball. A Magic 8 Ball is a toy that
gives you a random answer when shaken. And the answers are totally random. The
original Magic 8 Ball as 20 possible answers, which you can find here:
https://en.wikipedia.org/wiki/Magic_8-Ball#Possible_answers. Your program
should be able to responde with any of the twenty possible answers.

Still not sure what a Magic 8 Ball is? Here's a great video explanation
https://youtu.be/WSaS17CSS4c and a website with similar behaviour
http://www.ask8ball.net/

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
MAGIC 8-BALL SAYS: Yes definitely
```

```text
MAGIC 8-BALL SAYS: My sources say no
```

```text
MAGIC 8-BALL SAYS: Ask again later
```


#### 2. Dice Roll

Write a program that simulates a dice roll by picking a random number from 1-6
and then picking a second random number from 1-6. Add the two values together,
and display the total.

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
Roll #1: 3
Roll #2: 5
The total is 8!
```

```text
Roll #1: 2
Roll #2: 1
The total is 3!
```

```text
Roll #1: 6
Roll #2: 5
The total is 11!
```


#### 3. Fortune Cookie

Write a program that simulates getting a fortune from a fortune cookie. You
must have at least ten fortunes. If you're having a hard-time thinking of
fortunes, do a search online for "fortune cookies fortunes list."

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
Fortune cookie says: "You will have a great time doing your homework for the Java Class."
```

```text
Fortune cookie says: "Believe it can be done."
```

```text
Fortune cookie says: "Practice, practice, practice. Remember."
```


#### 4. Enter Your Bank PIN

Write a program that simulates being asked for your bank PIN (like at an ATM or
when buying something at the grocery store). Your program should ask the user
the enter their PIN number until they enter the correct answer (meaning that if
they enter the wrong answer you should ask them again).

Make the pin they are supposed to guess always be "0775".

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
WELCOME TO THE BANK OF <YOUR FIRST AND LAST NAME>.
ENTER YOUR PIN: 1234

INCORRECT PIN. TRY AGAIN.
ENTER YOUR PIN: 5342

INCORRECT PIN. TRY AGAIN.
ENTER YOUR PIN: 6542

INCORRECT PIN. TRY AGAIN.
ENTER YOUR PIN: 0775

PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.
```


#### 5. Enter Your Bank PIN with Lockout

For this assignment, we can start where we left off on the last assingment and
make a few modifications to lock the user out after 3 incorrect tries. You can
simulate locking the user out by stopping your program.

You should have two files. One of assingment #4 and another for #5.

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
WELCOME TO THE BANK OF <YOUR FIRST AND LAST NAME>.
ENTER YOUR PIN: 1234

INCORRECT PIN. TRY AGAIN.
ENTER YOUR PIN: 5342

INCORRECT PIN. TRY AGAIN.
ENTER YOUR PIN: 6542

YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.
```


#### 6. One Character at a time

Write a program that lets a user enter a message which is the printed to the
screen one character at a time along with its index. Hints: you already know
how to read user input using the `Scanner` class, but in case you forgot, here
is a link to the documentation: https://goo.gl/Dd54UP. If you're going to loop
over a string you need to know its length, which you can get using the
`.length` method. Read about it here: https://goo.gl/CR5uTb. Finally, to get a
character at a specific location of a string, you can use the `.charAt` method.
Read about `.charAt` here: https://goo.gl/ptYxW4.

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
Enter your message: I like learning Java!
Here are the characters in order:

0: 'I'
1: ' '
2: 'l'
3: 'i'
4: 'k'
5: 'e'
6: ' '
7: 'l'
8: 'e'
9: 'a'
10: 'r'
11: 'n'
12: 'i'
13: 'n'
14: 'g'
15: ' '
16: 'J'
17: 'a'
18: 'v'
19: 'a'
20: '!'
```


#### 7. Grocery List

Write a program that saves a grocery list for you. Your program should say how
many items are in the list, then ask the user if they want to add an item. If
the user enters `y`, the program should prompt the user to type in the item.
Then it should loop back to the beginning. If the user enters `n`, the program
should stop asking for new items and display the whole list, and then exit.

You can store the grocery items into a `ArrayList<String>`. Here is
documentation for `ArrayList`: https://goo.gl/AEkzaM.

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
You have 0 items in your grocery list.
Would you like to add an item? [y/n]: y
What is the item: bread

You have 1 items in your grocery list.
Would you like to add an item? [y/n]: y
What is the item: eggs

You have 2 items in your grocery list.
Would you like to add an item? [y/n]: y
What is the item: milk

You have 3 items in your grocery list.
Would you like to add an item? [y/n]: n

Here is your grocery list:
- bread
- eggs
- milk

Goodbye.
```


#### 8. Character Positions

Write a program that first asks a user to type in a word and then asks the user
to type in a single character. If that character does not appear in the word
print out this message: "That character is not in the word!". Otherwise, print
"Here are the positions of that character:" followed by a list of indexes where
that character appears in the word.

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
Type a word: rabbit
Type a character: a

Here are the positions of that character:
1
```

```text
Type a word: carrot
Type a character: r

Here are the positions of that character:
2
3
```

```text
Type a word: bike
Type a character: c

That character is not in the word!
```


#### 9. Calculator

Write a calculator program that allows you to add, subtract, multiply, and
divide two numbers. The calculator supports integers (`int` in Java) and real
numbers (`double` in Java), so make sure you are appropriately reading user
input and storing results. You can stop your Calculator program by pressing
<kbd>Ctrl + C</kbd>.

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
> 2 + 3
= 5
> 4 * 9
= 36
> 7 - 3
= 4
> 12 / 4
= 3
```

Note: when testing your code works for this assignment, make sure you put
spaces before and after the operators (`+`, `*`, etc.) or else Java won't know
where a number starts and end.


#### 10. Calculator with error handling, quit, and more operators

Let's make the previous Calculator program a little more user friendly. We're
going to make the following changes:

- When a user uses an unsupported operator (like `&`), let's given them a
  helpful message telling them.

- Let users type "quit" to exit the program instead of <kbd>Ctrl + C</kbd>.
  Keep in mind that you will have to read input as a string to check if it is a
  special keyword, like "quit" in which case you would exit the program, and if
  it is not then you can assume it is a number which would require you to
  convert a `String` into a `double` (hint: https://goo.gl/VW4RbX)

- Add support for the modulus (`%` in your calculator and `%` in Java) operator
  and exponents (`^` in your calculator and `Math.pow` in Java).

Below is sample output of what you might see when running your program. Your
output style and text should be the same as what we have provided below:

```text
> 32 - 4
= 28.0
> 23 & 2
Error, invalid operator: &
> 10 % 3
= 1.0
> 3 ^ 2
= 9.0
> 3 ^ 3
= 27.0
> quit
Goodbye.
```

Here's an example of how your program should behave:

[![asciicast](https://asciinema.org/a/CtTOeGgSIMwu6F1D1yO4oIwyD.png)](https://asciinema.org/a/CtTOeGgSIMwu6F1D1yO4oIwyD)
