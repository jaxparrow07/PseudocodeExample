# Pseudocode Example
Writing code/instructions of logic in human readable ( Basic English ) format which can be later understood by non-programmers. When reading it, you need to understand or imagine what it is actually going to do. Doesn't follow any strict syntax/way to write the instructions. 

## Suggestions to write Pseudocode

* Capitalize Key Commands ( **IF** number is > 10 **THEN** )
* Write one statement per line
* Use Indentation ( `TAB` key if digitally )
* Be Specific
* Keep it simple and neat

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

#### (*) Some points
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


