p = 1000

r = 0.07

years = (10,20,30)

for n in years:

    growth factor = (1 + r) ** n

    amount = p * growth factor
    
    print(f"{n} years: ${amount:2f}")