#strings
A='Pavan Kumar'
print(A[1])
print(A[::-1])
print("Kumar" in A)
print('yadav' not in A)
print(len(A))
#list
A=[10,30,40]
print(A)
print(len(A))
print(type(A))
B=["numbers",A]
print(B)
print('first',A[::2])
print(B[1][1])
print("list",B[1][0:2:1])
#change list items
A[1]=60
A[0]=35
print(B)
print(A+B)
#add item/items to list
A.append([70])
print(A)
A.extend([69,88])
print(A)

#add in specific position in list
A.insert(1,50)
print('inserted',A)
A[0:0]=[55,65,80]
print('multiple',A)

#deleting list
print(len(A))
del A[1]
print('deleted',A)
print(len(A))
del A[1:3]
print('del list',A) 
print(len(A))

#remove from list
A.remove(55)
print(A)
print(len(A))
print(A.pop(1))
print(A[3])
A.clear()
print(A)

#tuple 
marks=[40,60,70,80]
print(type(marks))
subjects='telugu','maths','english','science',marks
#marks(1)= 56 it is not possible(immutable)
print('marks assigned in order',subjects,sep=' = ')
print(subjects[0::2])
subjects[4][0]=80
print('replaced',subjects)
subjects[4][0:0]=90,89
print(subjects)

#boolean 
print("""===boolean===""")
a=20
b=-30
print(type(a))
print(a>=b)
print(bool(b))
c=0
print(bool(c)) #show type is true or false (not possible for others)

#set
print('==set==')
friends={'pavan','nag','shyam','rakesh'}
print(type(friends))
emptySet={}
print(type(emptySet))
#so we have to use function set()
emptySet=set()
print(type(emptySet))
friends.add('teja')
print(friends)
friends.update(['raventh','bhargav'])
print(friends)

#removing from set
friends.discard('raventh')
print(friends)
friends.remove('bhargav')
print(friends)
print(friends.pop())

print('union')
a={10,20,30,40}
b={20,40,60,80}
abUnion=a.union(b) # or a | b
print(abUnion)

print('union')
a={10,20,30,40}
b={20,40,60,80}
abIntersection=a.intersection(b) # or a&b
print(abIntersection)

print(a.difference(b)) # or a-b
print(a.symmetric_difference(b)) #or a^b

#dictionary 
print('===dictionary===')
dictionary={'name':'pavan','village':'udamalapadu','marks':'74%'}
print(type(dictionary))

nestedDic={'college':"SVCE",'old details':dictionary}
print(nestedDic)

print(dictionary["name"])
print(dictionary.get('marks'))

#small program by using dictionary
'''S1={ 1:{'a':'pav','marks':55},
2:{'a':'pav','marks':30}, 
3:{'a':'pav','marks':65}, 
4:{'a':'pav','marks':90}}
rollNumber=int(input())  #don't forgot to keep int otherwise by default it will consider string
percentage=S1[rollNumber]['marks']
if(percentage>35):
  print('pass')
else:
  print('fail')'''
  
nestedDic['old details']['Good_person']=True
print(nestedDic)


a=[10,10,30,30,40,40]
b=set(a)
print(b)