#  Prompt the user to enter HIS or HER problem.

#  Ignore the input entered by the user.

#  Prompt the user Have you have this problem before (yes or no).

#  if the user enters "yes",Display "Well you have it again".

#  If the user enters "no", Display "Well you have it now".





print("What is your problem:")
input()

print("Have you have this problem before:'yes or no'")
response  = input().strip().lower()

if response == "yes":
   print("Well, you have again")
elif response == "no":
   print("Well, you have it now")
else:
   print("please answer with:'yes' or 'no':")