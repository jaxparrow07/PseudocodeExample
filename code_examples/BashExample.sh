#!/usr/bin/env bash

# Setting the counter to 1
number=1

# While number is lesser or eqal to 20. If not, stop the loop.
while [[ $number -le 20 ]];do

	# MODULO is dividing and getting the remainder

	# Checks if the remainder is 0 after dividing the number by 15
	if [[ $(($number % 15 )) -eq 0 ]];then
		echo "FizzBuzz"

	# Checks if the remainder is 0 after dividing the number by 3
	elif [[ $(($number % 3 )) -eq 0 ]];then
		echo "Fizz"

	# Checks if the remainder is 0 after dividing the number by 5
	elif [[ $(($number % 5 )) -eq 0 ]];then
		echo "Buzz"

	# If none of the above is correct, this will be executed.
	else
		echo $number

	fi
	
	# Increment counter by 1
	number=$(( $number + 1 ))

done