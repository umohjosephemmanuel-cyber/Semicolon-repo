# Initialize the total passes to "0".

# Initialize the valid input to "0".

# Repeat "5 TIMES" for a fixed number of inputs.

# Prompt the user to Enter a number between "1 and 2" only.

# Save the input received from the user.

# Measure the  total passes by "1" until user input is "1" or "2".

# Measure the valid inputs by "1".

# Calculate the failures as total passes valid inputs.

# Display, "TOTAL PASSES".

# Display, "VALID INPUTS".

# Display, "FAILURES".









totalpasses = 0

validinput = 0

for i in range (5):

    while True:

        mamainput = input("Enter a value between (1 or 2):")

        totalpasses += 1


        if mamainput == "1" or mamainput == "2":

           validinput += 1

           break

failures = totalpasses - validinputs

print("Total passes:", totalpasses)
print("Valid inputs:", validinputs)
print("Failures:", failures)