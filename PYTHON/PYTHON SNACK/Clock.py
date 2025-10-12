#  Write a function that takes in minues and gives the equivalent 

#  In seconds and hour

#  SAMPLE: 
 
#  Input:"Pineapple"

#  Output:30 min in sec is 1800 and in hour is 0.5









def get_minutes_in_seconds(minutes):
 seconds = minutes * 60 
 hours = minutes / 60
 return seconds, hours 





minutes1 = int(input("Enter the amount of minutes: "))
result = get_minutes_in_seconds(minutes1)
print(result)