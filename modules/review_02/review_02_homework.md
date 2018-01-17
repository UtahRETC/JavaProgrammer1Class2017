# Review 2 Homework

<style>
@media print {
  pre {
    border: 1px solid gray;
    page-break-inside: avoid;
  }
}

.break {
  page-break-after: always;
}
</style>

#### 1. Magic 8 Ball

Write a program that simulates a Magic 8 Ball. A Magic 8 Ball is a toy that
gives you a random answer when shaken. And the answers are totally random. The
original Magic 8 Ball as 20 possible answers, which you can find here:
https://en.wikipedia.org/wiki/Magic_8-Ball#Possible_answers. Your program
should be able to responde with any of the twenty possible answers.

Still not sure what a Magic 8 Ball is? Here's a great video explination
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

Let's alter the previous assignment ("Enter Your Bank PIN") to lock the user
out after 3 incorrect tries. You can simulate locking the user out by stopping
your program.

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
