# prompt the user to enter five digit integer.

# save numbers entered by the user.

# calculate between the digits,Display the number is palindrome.

# else, Display the number is not a palindrome.

# if not Display invalid input please enter a five digit integer.










number = int(input("Enter a five digit integer:"))

if 10000 <= number <= 99999:
    digit1 = number // 10000
    digit2 = (number // 1000) % 10
    digit4 = (number // 10) % 10
    digit5 = number % 10

    if digit1 == digit5 and digit2 == digit4:

        print(f"{number} is a palindrome")

    else:

        print(f"{number} is not a palindrome")

else:

    print("Invalid input please enter a five digit integer")