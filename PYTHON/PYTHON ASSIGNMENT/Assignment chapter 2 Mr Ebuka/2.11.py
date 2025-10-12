2.11

# Step 1: Prompt the user to enter a five digit integers.

# Step 2: Use floor division,remainder and operator to separate the digit.

# Step 3:Find the first digit and the remaining four digit.

# Step 4:Find the second digit and the remaining two digit.

# Step 5:Find the third digit and the remaining two digit.

# Step 6:Find the fourth digit and the fifth digit.

# Step 7:Print out the digits.





number = int(input("Enter a five digit integer:"))

digit 1 = number // 10000
remaining number = number % 10000

digit 2 = remaining number // 1000
remaining number = remaining number % 1000

digit 3 = remaining number // 100
remaining number = remaining number % 100

digit 4 = remaining number // 10 
digit 5 = remaining number % 10

print(digit 1, "  ", digit 2, "  ", digit 3, "  ", digit 4, "  ", digit 5)

