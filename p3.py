from datetime import date
#arthematic operations
'''a=input('a')
b=input('b')
a=int(a)
b=int(b)
print('addition',a+b)
print('subtraction',a-b)
print('multiply',a*b)
c=float(a/b)
print('division',c)
print('reminder',a%b)
print('floring',a//b)
print('power',a**b)'''
#relational operations
'''a=input('a')
b=input('b')
a=int(a)
b=int(b)
print(a==b)
print(a>b)
print(a<b)
print(a>b)
print(a<b)
print(a!=b)'''
'''#assignment operators
a=int(input('a'))
b=int(input('b'))
a+=b
print(a)
a-=b 
print(a)
a%=b
print(a)
a>>=b
print(a)
a//=b 
print(a)'''
#find the age of the person by telling birth year
a=int(input('year of birth'))
b= date.today().year
print('Age of the person',b-a ,sep='=')
