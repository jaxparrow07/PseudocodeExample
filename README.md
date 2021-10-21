# Pseudocode Example
Writing code/instructions of logic in human readable ( Basic English ) format which can be later understood by non-programmers. When reading it, you need to understand or imagine what it is actually going to do. Doesn't follow any strict syntax/way to write the instructions. 

## Suggestions to write Pseudocode
These are not **rules**. Think of them as **suggestions**.

* Capitalize Key Commands ( **IF** number is > 10 **THEN** )
* Write one statement per line
* Use Indentation ( `TAB` key if digitally )
* Be Specific
* Keep it simple and neat

## Writing
You can write key elements in UPPERCASE. Like **WHILE, LOOP, TRUE, IF, THEN, ELSE, ELSE IF** actions.<br>
Simply write things like setting counter, setting name, increasing the number, stopping it in basic english.

#### Example code
```
Set classroom empty
Set student "Jack"
Add student to classroom
```
This is more like a I'm being added to an array called classroom in simple terms.

#### Example Loop 
When you want to do a specific action for a specific amount of time
```
FOR LOOP:
Set counter to 1
Stop when counter reaches 10
Increment by 1

-> IF ( YOUR CASE HERE )
-> -> ( THE INSTRUCTIONS IF THE ABOVE CASE/CONDITION IS CORRECT )
```

`->` means a single indentation or a `TAB` keypress

for example we can turn it to
```
FOR LOOP:
Set counter to 1
Stop when counter reaches 10
Increment by 1

  IF number is > 5
    print "This number is greater than 5"

```
You will get the message after it starts from 6. So you will get the "The number is greater than 5" 5 times respectively.
<hr>

## Sample Excercise
We're going to write a pseudocode instructions first. Simply, think of the instructions in basic English.

### FizzBuzz
#### Question (What we want to do)
Write a program that prints the number from 1 to 20<br>
For multiples of three print "Fizz" instead of the number<br>
For the multiples of five print "Buzz" instead of the number<br>
For numbers whiich are multiples of both three and five print "FizzBuzz"<br><br>
#### Solution (What we are going to do)
Loop ( cycle/count ) from 1 to 20. Stop counting if the number is 20. Increase the counter after checking the conditions ( checking whether it is divisible or not ). Check if the current number is divisble by 3 ( Using modulo to divide the number and then checking if the remainder is 0 ) if yes, print "Fizz". Else if the number is divisble by 5, print "Buzz" instead. Else If the number is both divisble by 3 and 5 ( In this case of 1 to 20, 15 is the only number which is divisible by both 3 and 5 ). So, we will use it instead of indirectly checking the number. If none of the above statements/checks don't pass ( e.g 7,8,.. ), we will print the number as it is. This instructions applies to all the 20 loops/cycles/counts
<br>
#### Writng Pseudocode
##### Method 1 ( Using For Loop - Little Advanced )
```
FOR LOOP:
Set counter to 1
Break when counter reaches 20
Increment counter by 1

  IF number MOD 15 == 0
  print 'FizzBuzz'

  ELSE IF number MOD 3 == 0
    print 'Fizz'
    
  ELSE IF number MOD 5 == 0
    print 'Buzz'
    
  ELSE
    print number
```
Runs a loop, sets the counter to 1, stops on 20, increases the number by 1 each time it cycles ( 1 to 20, which means 20 cycles ). The conditions being checked as mentioned above and the expected output will be printed.

#### Method 2 ( Using While Loop - More Simpler )
```
Set counter to 1
WHILE LOOP:
Break when counter reaches 20

  IF number MOD 15 == 0
    print 'FizzBuzz'

  ELSE IF number MOD 3 == 0
    print 'Fizz'
    
  ELSE IF number MOD 5 == 0
    print 'Buzz'
    
  ELSE
    print number
    
  Increment counter by 1

```
Sets the number to 1, Runs a loop. While **the number is lesser or equal to 20**, checks the following statements and prints the number. Increases the number before another cycle. Once it increases the number to 21. This loop/cycle will no longer run.


<hr>

### Some points
**Loops**<br>
In loops, the else if and the else statement will be checked if the first or the previous statement is wrong. e.g
```
Set number to 10

  IF number > 15
    print "Less than 15"

  ELSE IF number > 20
    print "Less than 20"

  ELSE IF number > 50
    print "Less than 50"

  ELSE
    print "IDK"

```
Here we know the number is 10. All of the statements are true. 10 is lesser than 15, 20 and 50. But, it will stop if one of the statement is correct and you will only get the output of **"Less than 15"** since it will be ended and it won't moving to the next condition/checks.

<hr>

### Real Code Solutions of the above problem
I wrote some code examples of the same problem to better understand how the same logic and instructions can be applied in various programming technologies/languages.
