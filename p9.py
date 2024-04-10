#Functions 
''' a=int(input('Give the number'))
print('even number') if (a%2==0) else print('odd number')'''

#if multipe numbers should check
'''a=18
b=19
c=20
print('{}even number'.format(a)) if (a%2==0) else print('{} odd number'.format(a))
print('{}even number'.format(b)) if (b%2==0) else print('{} odd number'.format(b))
print('{}even number'.format(c)) if (c%2==0) else print('{} odd number'.format(c))'''

#by using Functions
'''def even_or_odd(a):
    'used to check weather given number is even or odd' #docstring to tell about the program
    print('{} is even number'.format(a)) if (a%2==0) else print('{} is odd number'.format(a)) 
   

even_or_odd(18)
even_or_odd(19)
even_or_odd(12)
print(even_or_odd.__doc__)
#print(print.__doc__)
print(len.__doc__)'''

#used to return data exit from the function
#RETURS
'''def cube(a):
    cube2=(a*a*a)
    #print(cube2)
    return cube2

print(cube(int(input())))'''
#pass by reference,pass by values
def marksUpdate(myMarks): # normaal way 
    marks=[90,50,30,86,79]
    marks[2]= myMarks
    print(marks)   

marksUpdate(70)

# actual way
'''def marksUpdate(myMarks):
    myMarks[2]=int(input())
    
marks=[90,50,30,86,79]
marksUpdate(marks)
print(marks)'''

'''def marksUpdate(myMarks):
    myMarks=[40,70,80]
    print(myMarks)
    return myMarks
    
marks=[90,50,30,86,79]
print(marksUpdate(myMarks[1]=20))
print(marks)'''
 
 #default argument
'''def A(b):
    print(b)
    return b

A(50)
print(A(20))'''

'''def A(b):
    b=10
    print(b)
    return b

A(50)
print(A(20))'''
#key word arguments
'''def bottleDetails(name,color,capacity,cost):
    print('name:{} color:{} capacity:{} cost:{}'.format(color,name,capacity,cost))

#bottleDetails('pav','red',1,20) in this case if you change the order it will make problem
bottleDetails(name='pav',color='red',capacity='1lit',cost='20/-') #here we are giving with variable,we have been mentioned'''


#'variable' number of argument
'''def multiply(c,*a):
    mul=1 #if y0u want direct here you can mention
    mul=c #by this you can give the value from out of the function
    for b in a:
        mul=mul*b
    return mul
   
print(multiply(5,1,2,3,4))'''



'''def printAll(*a):
    for b in a:
        print(b)
    
printAll(10,20,30)'''

'''def bottleDetails(**a):
    for b,c in a.items():
        #print('{}: {}'.format(b,c)) it is good method because we can assign the name with decent way.
        print(b,' :',c)
    
bottleDetails(color="red", bottleName='pav',capacity=1,cost=30)'''

'''#passing *args (variable number of argument), *kwargs
def fruits(apple,banana,orange):
    print(apple,banana,orange)
    
cost=(30,10,20)
#fruits(cost)# in this case only one at a time will assign so it will show error is you had try to exeecute
fruits(*cost) #here it will execute'''

#yield
'''def coco(a):
    b=a*10
    #return b
    yield b
    print('super')
    
cap=coco(20)
#print(cap)
#print(list(cap))
for i in cap: # for loop must used to get the values or output proprerly 
    print(i)
 
#lambda
a=lambda c:c*c*c


print(a(int(input())))'''


#2ed
#print(lambda (c:c*c*C(3)))'''

#filter normal program
'''def even(a):
    return a%2==0

lis=[10,32,14,5,1,9]
filters=filter(even,lis)
for i in filters:
    print(i)
    
#filter with using lambda
lis=[10,20,15,21]
print(tuple(filter(lambda a:a%2!=0,lis)))'''

#map
'''def cap(name):
    yield name
    return name.upper()
    
lis='a'
print(list(map(cap,lis)))
print(list((cap(lis))))'''

#map by using anonymous function
'''lis=['a','b','c']
a=map(lambda lis:lis.upper(),lis)
#a=
print(list(a))
print(list(lambda lis:lis.upper()))'''

#Reduce
import functools

'''def add(s,f):
    return s
lis=[1,12,24,4,4]
print(functools.reduce(add,lis))'''

lis=[1,12,24,4,4]
print(functools.reduce(lambda c,d:c*d,lis))








