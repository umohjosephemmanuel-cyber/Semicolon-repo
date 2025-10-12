#  Question:What is wrong with this code.



#  Answer.

#  The outer loop (ROW): This runs from 0 to 9.

#  The inner loop (COLUMN): This runs from 0 to 9.

#  If the row number is (ODD)  (ROW % 2 == 1), it prints (<) LESSTHAN.

#  If the row number is (EVEN): This means it prints (>) GREATERTHAN.

#  (end=''): This ensures that all charecters are printed side by side without any line being broken.

# [print()] : This means when the inner loop is being moved to the next line.









for row in range(10):

    for column in range(10):

        print('<' if row % 2 == 1 else '>', end='')

    print()