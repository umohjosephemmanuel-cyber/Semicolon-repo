def get_prime_numbers(numbers):

	prime = 0
	for count in range(numbers):
		prime = count * numbers
		if prime < count:
			prime = numbers
	
	return prime

	
numbers = 5
print(get_prime_numbers(numbers))










def get_minimum_numbers(numbers): 
	minimum_number = numbers[0]
	for count in numbers:
		if count < minimum_number:
			minimum_number = count


	return minimum_number
numbers = [1, 2, 3, 4, 5,]
print(get_minimum_numbers(numbers))










def get_maximum_numbers(numbers):
	maximum_number = numbers[0]
	for count in numbers:
		if count > maximum_number:
			maximum_number = count


	return maximum_number
numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100,]
print(get_maximum_numbers(numbers))




