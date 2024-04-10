#programs practice
'''a=int(input())
b=a[::-1]
print(b)'''
'''import math
#fibonacii
n=int(input('give the terms:'))
n1,n2=0,1
c=0
if n<=0:
    print('give +ve number')
else:
    #print(fibonacii(n))
    print("Fibonacci series for",n,'th terms is')
    while c<n:
        print(n1)
        nth=n1+n2
        n1=n2
        n2=nth
        c+=1

#factorial
import math
def factorial(n):
   # print('1') if n==0 and n==1 else print(math.factorial(n))
    return 1 if n==0 and n==1 else math.factorial(n)
n=int(input())   
print(factorial(n))'''

'''def factorial(n):
    c=1
    if n==0 and n==1:
        return 1
    else:
        n1=1
        while n>0:
      
            #n1=n-1
            #n2=n1
   
            n1=n*n1
            n=n-1
        return n1
            #c+=1
#print(n1)
#n=int(input())
print(factorial(10))'''

'''n=int(input())
c=0
n1=1
while n>0:
    #n1=n-1
    #n2=n1
   
    n1=n*n1
    n=n-1
    c+=1
print(n1)'''

'''def hcfnaive(a,b):
    if(b==0):
        return a
    elif b>a:
        return b%a
    else:
        return a%b
  
a = 10
b= 15
print(hcfnaive(a,b))
# prints 12
print ("The gcd of 60 and 48 is : ",end="")

def Gcd(a,b):
    if(b==0):
        return a
    elif(b==a):
        return a
    else:
        c=a
    for i in range(1,c+1):
        if(a%i==0) and (b%i==0):
            gcd=i
            
            
        return gcd
        break
    else:
        return 'not GDC'
        

a=int(input())
b=int(input())
print(Gcd(a,b))'''
                
                
'''def computeGCD(x, y):
  
    if x > y:
        small = y
    else:
        small = x
    for i in range(1, small+1):
        if((x % i == 0) and (y % i == 0)):
            gcd = i
              
    return gcd
  
a = 60
b= 48
  
# prints 12
print ("The gcd of 60 and 48 is : ",end="")
print (computeGCD(50,20))'''
    
'''num = int(input())
  
# If given number is greater than 1
if num > 1:
  
    # Iterate from 2 to n / 2
    for i in range(2, int(num/2)+1):
  
        # If num is divisible by any number between
        # 2 and n / 2, it is not prime
        if (num % i) == 0:
            print(num, "is not a prime number")
            break
        else:
            print(num, "is a prime number")
  
else:
    print(num, "is not a prime number")'''
    
    
'''n=int(input("Enter number:"))
temp=n
rev=0
while(n>0):
    dig=n%10
    rev=rev*10+dig
    n=n//10
if(temp==rev):
    print("The number is a palindrome!")
else:
    print("The number isn't a palindrome!")
print(rev)'''

'''def triangle(n):
     
    # number of spaces
    k = n - 1
 
    # outer loop to handle number of rows
    for i in range(0, n):
     
        # inner loop to handle number spaces
        # values changing acc. to requirement
        for j in range(0, k):
            print(end=" ")
     
        # decrementing k after each loop
        k = k - 1
     
        # inner loop to handle number of columns
        # values changing acc. to outer loop
        for j in range(0, i+1):
         
            # printing stars
            print("* ", end="")
     
        # ending line after each row
        print("\r")
        
n=int(input())
triangle(n)'''


def triangle(n):
     
    # number of spaces
    k = n - 1
 
    # outer loop to handle number of rows
    for i in range(0, n):
     
        
     
        # inner loop to handle number of columns
        # values changing acc. to outer loop
        for j in range(0, i+1):
         
            # printing stars
            print("* ", end="")
        # inner loop to handle number spaces
        # values changing acc. to requirement
        for j in range(0, k):
            print(end=" ")
     
        # decrementing k after each loop
        k = k - 1
     
        # ending line after each row
        print("\r")
        
n=int(input())
triangle(n)