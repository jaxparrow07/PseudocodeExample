# Method 2 ( While )


# Setting counter to 1
number = 1

# While number is lesser or eqal to 20. If not, stop the loop.
while number <= 20:

	# MODULO is dividing and getting the remainder

	# Checks if the remainder is 0 after dividing the number by 15
	if (number % 15 == 0):
		print("FizzBuzz")

	# Checks if the remainder is 0 after dividing the number by 3
	elif (number % 3 == 0):
		print("Fizz")

	# Checks if the remainder is 0 after dividing the number by 5
	elif (number % 5 == 0):
		print("Buzz")

	# If none of the above is correct, this will be executed.
	else:
		print(number)

	# Increment counter by 1
	number = number + 1

	# We can use number += 1 in python too | This is more understandable
