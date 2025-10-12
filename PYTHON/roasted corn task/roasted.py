def get_minimum_numbers(numbers): 
	minimum_number = numbers[0]
	for count in numbers:
		if count < minimum_number:
			minimum_number = count

	return minimum_number
numbers = [1, 2, 3, 4, 5]
print(get_minimum_numbers(numbers))







def get_maximum_numbers(numbers):
	maximum_number = numbers[0]
	for count in numbers:
		if count > maximum_number:
			maximum_number = count

	return maximum_number
numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
print(get_maximum_numbers(numbers))








def get_list_squared(list):
	list_square = []
	for count in list:
		list_square.append(count**2)
		
	return list_square
list = [2, 3, 4, 5]
print(get_list_squared(list))







def get_sum_square_of_the(list):
     sum_square = 0
     for count in list:
        sum_square = sum_square + (count ** 2)

     return sum_square
list = [2, 3, 4, 5, 7]
print(get_sum_square_of_the(list))








def get_longest_word_and_length_of_longest_one(list_of_words):
	longest_word = ""
	length_of_longest_one = []
	for count in list_of_words:
		if len(count) > len(longest_word):
			longest_word = count 

	length_of_longest_one = len(longest_word)
		
	return longest_word , length_of_longest_one
	
	

list_of_words = ['welcome', 'out', 'weather', 'mobile', 'breakfast', 'journey']
print(get_longest_word_and_length_of_longest_one(list_of_words))








