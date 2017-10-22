# Java cert prep class (Module 2)

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

- **Growing autonomy**: Students should begin to be able to experiment with the code presented in class and develop similar exercises off of a presented code exercise. Likewise they should know how to contact teaching assistants and look for their own solutions.
- **Practice**: More practice, students should be able to replicate and compile sections of code presented in class following proper rules of syntax with some understanding of <mark>control flow</mark>
- **Introduce Boolean Logic, Conditionals and Loops** 
   - Understanding of logical operators
     - ```!=```, ```==```, ```&&```, ```||``` 
   - Grasp of the syntax for different loop types
      - ```for-loops```, ```do-while```, ```while loops```
   - Grasp of conditional expressions
      - If-else statements vs Only If.
      - Switch statements.
      - <mark>Control flow</mark>   
<div class="break"></div>

### Class Exercises

**Conditional notation**
```java
int myFavoriteNumber = 42;
int yourFavoriteNumber = 42;

if(myFavoriteNumber = yourFavoriteNumber){
   System.out.println("We have the same favorite number!")
}
```
What is wrong with the example above? (2 problems)

**Control flow**

```java
boolean boughtThePizza = false;
int payDay = 15;
int currDate = 14;
int currBalance = 8;

if(currBalance >= 10){
    System.out.println("You can buy the pizza");
    boughtThePizza = true;
}else{
    System.out.println("You are too poor to eat here.");
    boughtThePizza = false;
}
if(currDate >= payDay){
    currBalance = currBalance + 400;
}
```
Is ```boughtThePizza``` true or false? Order Matters!! Let's fix it so it works. (Just rearrange the code, don't add your own)

**Switch Practice**

Write a switch statement that takes a number or char and includes:
* at least 1 ```case 'value'``` clause
* at least 1 ```break;```
* a ```default:``` clause

**For-loop Practice**
```java
//What do you think this does?
int number = 4;
int tempValue = 0;
for(int i = 0; i < number; i++){
    for(int j = 0; j < number; j++){
        tempValue++;
    }
}
System.out.println(tempValue);
```
* What does the previous block of code output?
* Can you make one to "cube" a number? (x^3)

### Homework

**Q1)** With just ints and for-loops, recreate this pattern:
```java
1
22
333
44444
555555
4444
333
22
1
```
**Q2)** Write your own switch statement with:
 * at least one ```break;```
 * a ```default:``` statement

**Q3)** Write your own if-blocks that use the following at least once:
* ```!```,```<=``` OR```>=```, ```&&```, ```||```
* Multiple clauses in one statement.
* If and else.
* If, else if, and else.

**Q4)** Use loops to recreate the [Fibonacci Sequence](https://www.mathsisfun.com/numbers/fibonacci-sequence.html) with the initial indexes of 0 and 1.
* The first 10 indexes are (0,1,1,2,3,5,8,13,21,34...)
* What is index #12? #20? #50? 
<div class="break"></div>

## Resources

- Class 1 Material: https://github.com/UtahRETC/JavaProgrammer1Class/tree/master/classes
