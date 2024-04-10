'''sum=10
def calculate():
    currentsum=200
	totalsum=sum+currentsum
	print(totalsum)
calculate();'''
#smallvprogram for cash
cash = input("enter your cash and pin")
cash=int(cash)
accountBalence=5000
if(accountBalence<cash):
    print('insufficient balence')
else:
    remainingAmount = accountBalence-cash
    print('take your cash',cash,sep="->",end=" and ")
    print('reaming amount',remainingAmount)
    print('take your cash{} , Balence ammount{}'.format(cash,remainingAmount))

    print('Thank you')