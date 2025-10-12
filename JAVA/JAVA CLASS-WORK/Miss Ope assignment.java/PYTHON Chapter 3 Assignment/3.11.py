# Initialize total miles to 0.

# Initialize total gallons to 0.

# Prompt the user to enter the gallons used (-1 to end).

# Save the gallons entered by the user.

# Prompt the user to enter the miles driven for.

# Save the miles entered by the user.

# Calculate the MPG = miles driven / gallons used.

# Display, "The overall average miles/gallon was", overall mpg
 
# If not Display, "No data entered".







totalmiles = 0.0
totalgallons = 0.0

while True:
    gallonsused = float(input("Enter the gallons used (-1 to end):"))

    if gallonsused == -1:

        break

    milesdriven = float(input("Enter the miles driven:"))

    mpg = milesdriven / gallonsused

    print(f"The miles/gallon for this tank was {mpg: 6f}")

    totalmiles += milesdriven 

    totalgallons += gallonsused 

if totalgallons > 0:

    overallmpg = totalmiles / totalgallons

    print(f"The overall average miles/gallon was {overallmpg: 5f}")

else:

    print("No data entered")