# Create header rows using columns 'number', 'square', 'cube'

# For number from 0 to 5

# Calculate square = number * number

# Calculate cube = number * number * number

# print number, square, and cube aligned in columns





print(f"{'number':>6} {'square':>7} {'cube':>5}")

for number in range(6):

    print(f"{number:>6} {number**2:>7} {number**3:>5}")
