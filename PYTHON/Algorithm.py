def get_prime_numbers(numbers):

	prime = 0
	for count in range(numbers):
		prime = count * numbers
		if prime < count:
			prime = numbers
	
	return prime
numbers = 5
print(get_prime_numbers(numbers))














number = [9167340664]
print(number)
print(sorted("Monarchs"))













number.sort(reverse = False)
print(numbers)
print(sorted("BOBO",reverse = "False"))

















def is_palindrome(word):
	return word[0:-4] == word
print(is_palindrome("1,2,3,4,5,6,7,8,9"))

















names = ["Joseph", "Millicent", "Dorathy", "Daniel", "Courage", "Taiwo", "Kehinde", "Victoria", "Emmanuel",]
fruit = "Cucumber"
sliced_names = names[5: :2]
sliced_fruit = fruit[6: :2]
print(sliced_names)
print(sliced_fruit)










word = "Developer"
sliced_word = [8]
print(sliced_word)








