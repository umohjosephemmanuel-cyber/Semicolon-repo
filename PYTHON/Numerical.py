# Prompt the user to enter first score.

# Prompt the user to enter second score.

# Prompt the user to enter third score.

# Calculate the average of the three scores.

# Determine each letter grade and print out the result as follows.








score1 = int(input("Enter first score:"))
score2 = int(input("Enter second score:"))
score3 = int(input("Enter third score:"))

average = (score1 + score2 + score3) / 3

if 90 <= average <= 100:
   grade = "A"
elif 80 <= average < 90:
   grade = "B"
elif 70 <= average < 80:
   grade = "C"
elif 60 <= average < 70:
   grade = "0"
else:
   grade = "F"

print("Average Score:", average)
print("Letter Grade:", average)


