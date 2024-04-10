#loops
#range
'''a=range(10)
print(a)
#for loops
numbers=(10,20,12,16)
for numbers2 in numbers:
    print(numbers2)
    print(numbers2*2) #we can arthematic operation each one individuly by 
# string in for loops
name='panvan'
for name2 in name:
    print(name2)
    print('name letters',name2)'''
#print last 2 charactor of my nane
name=input('type your name')
lastOne=name[-1:-2:-1]
lastBefore=name[-2:-3:-1]
for loop in range(1,13):
    for loop2 in range(1,10):
        if loop2<=5:
            print( )
        elif loop2<=11:
            print(lastOne*loop)       
            print(lastBefore*loop)

# dictionary
'''number={1:'pavan',2:'good person',3:'he knows every thing'}
for numb2 in number:
    print(numb2)
    print(number[numb2])'''
# ovels and consonents
'''name=input('give your name')
Ovels=['a','e','i','o','u','A','E','I','O','U']
for name2 in name:
    if name2 in Ovels:
    
        print(name2, " these are ovels")
    else:
        print(name2, 'consonts')'''
#how many ovels and consonents in my name
'''name=input('give your name')
Ovels=['a','e','i','o','u','A','E','I','O','U']
name3=0
ovels=[]
for name2 in name:
    if name2 in Ovels:
        name1=len(name2)
        name3=name1+name3
    ovels.append(name2)
print(ovels,len(ovels))    
    else:
        print(name2, 'consonts')'''
#break
'''name=input('give your name')
Ovels=['a','e','i','o','u','A','E','I','O','U']
for name2 in name:
    if name2 in Ovels:
        print("it has ovel")
        break'''
 #continue statement
number={1:'pavan',2:'good person',3:'he knows every thing'}
for numb2 in number:
    print(numb2)
    continue
    print(number[numb2])
#pass
number={1:'pavan',2:'good person',3:'he knows every thing'}
for numb2 in number:
    print(numb2)
    pass
    print(number[numb2])
#sum of marsks
'''marks=[89,82,99,89,87,79]
sum=0
for mark in marks:
    sum=sum+mark
print(sum)'''
#while loop
'''i=0
while i<10:
    i+=1
print(i)'''
#random
'''import random
print(random.randint(1,30))
#book cricket
score=0
runs=[]
while score<=280:
    flips=random.randint(1,100)
#eachBallscore=flips[-1]
    score=score+flips
    runs.append(flips)
print("times of fliped",len(runs),sep=' = ')
print('score in each over',runs)
print('Total score',score,sep=' ')
    '''
    
    

    

