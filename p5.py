#Data types
marks = int(input('marks'))
totalMarks=int(input('total marks'))
Percentage=(marks/totalMarks)*100
print('Percentage',Percentage,sep='=',end=' and ')
if (Percentage>35):
   print("Congragulations")
elif (Percentage<35):
   print("Better Luck Next Time")


