#control flows
#condition statement
'''print('===if===')
print('INDIA VS AUSTRALIA T20')
indiaNeed=int(input('India Need'))
currentScore=int(input('Score'))
lastBall=int(input('last ball'))
score=currentScore+lastBall
if score>indiaNeed:
    print('INDIA won the T20 Match')
elif score==indiaNeed:
    print('Match Tied')
else:
    print('Better luck next time')

#check given number is even or odd'''
'''number=int(input('Give the NUMBER'))
a=(number%2)
if (a==0):
    print('Given NUMBER is EVEN NUMBER')
elif (a>0):
    print('Given Numaber is ODD NUMBER')
else:
    print('NOT a NUMBER')
    
    
# nested if
number=int(input('Give the NUMBER'))
a=(number%2)
if (a==0):
    print('Given NUMBER is EVEN NUMBER',end=' ')
    if (number%4==0):
        print('AND also Dividend of 2 & 4')
    else:
        print('But not Dividend of 4')
    
else:
    print('Given Numaber is ODD NUMBER not divisible by 4' )'''
    
# elif rank check
'''rank=int(input('What is your rank'))
if (rank<=1000):
    print('Congrats, YOU GOT THE TOP RATED COLLEGE')
elif rank>1000 and rank<=10000:
    print('Congrats, YOU GOT THE 2ed RATED COLLEGE')
elif rank>10000 and rank<=40000:
    print('Congrats, YOU GOT THE Less RATED COLLEGE')
else:
    print('Better Luck Next Time') '''   

#short hand if
a=(input())
b=len(a)
if (b<=10): print('Your Registation is successful')
elif (b>10) and (b<=15): 
    print('Your registration successful',end=' but ')
    print('your name is bigger')
    print('warning your name is greater then 10 letters')
else:
    print('Your name size is too big',end=',')
    print('Registration is unsuccessful')
    print('SORRY PLEASE REDUCE YOUR NAME SIZE ')
    print('name letters should need to be between 0 to 15')
    
#SHORT HAND IF ELSE
'''a=int(input('Give The Numaber'))
print("even number")if (a%2==0)  else print('odd number')'''