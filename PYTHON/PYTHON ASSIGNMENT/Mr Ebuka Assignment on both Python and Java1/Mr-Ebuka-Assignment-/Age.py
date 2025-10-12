# prompt the user to Enter father's current age.

# Prompt the user to Enter son's current age.

#  Calculate the difference between father's age when it is as twice as the son's age.

# Assume the difference equals [0], Display "Father is exactly twice as old now".

# Assume the difference is greater than [0], Display "Father was twice as old", difference, "years ago".

# If not, Display "Father will be twice as old", difference, "years in future".








fatherage = int(input("Enter father current age:"))

sonage = int(input("Enter son current age:"))


difference = fatherage - 2 * sonage

if difference == 0:
   print("father is exactly twice as old now")

elif difference > 0:
   print("father was twice as old", difference, "years ago")

else:
   print("father will be twice as old",(difference), "years in the future")
  