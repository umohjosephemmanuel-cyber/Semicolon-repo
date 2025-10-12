#  PROMPT THE USER TO ENTER A FIVE DIGIT INTEGER.

#  SAVE NUMBER.

#  ASSUME THE DIGIT EQUALS NUMBER DIVIDED BY DIVISOR.

#  DISPLAY THE DIGIT ON THE SAME LINE.

#  NUMBER MODULO DIVISOR.







number = int(input("Enter a five digit integer:"))

for divisor in (10000, 1000, 100, 10, 1):

    digit = number // divisor

    print(digit, end=' ')

    number %= divisor