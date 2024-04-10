'''class A():
    def __init__(self, a={}):
        if not ('1'in a):
            a['1']=1
        else:
            a['1']+=1
            print(a['1'])
for i in range(3):
    a=A()'''

'''class parent:
    def test(self):
        print("alpha test")
    
class child(parent):
    pass

a=parent()
b=child()
a.test()
b.test()'''

'''class A():
    def __init__(self):
        self.bool=True
    def prnt(self):
        if self.bool:
            print('Hi')
            self.bool=False
        else:
            print("Bye")
class B(A):
    def __init__(self):
       
        self.val='555'
    def desp(self):
        print(self.val)
    
t1=B()
t1.prnt()'''

'''class A():
    def __init__(self):
        self.bool=True
    def prnt(self):
        return self.bool
    
t=A()
print(t.prnt())
print(A.prnt(t))'''

'''class A():
    def __init__(self):
        self.bool=1
    def prnt(self):
        if self.bool==1:
            print('Henry')
            self.bool=2
        else:
            print("met")
class B(A):
    def __init__(self):
        A.__init__(self)
        self.val='555'
    def desp(self):
        print(self.val)

t1=A()
t1.prnt()

t1=B()
t1.prnt()'''

import re
'''sum=0
p='py'
if re.match(p,'python.text'):
    print("at 1")
    sum+=1
if re.match(p,'text.py'):
    print("at 2")
    sum+=2
if re.search(p,'herepyfile'):
    print("at 4")
    sum+=4
if re.search(p,'numpy'):
    print("at 8")
    sum+=8

print(sum)'''

'''xyz=('apple','applets','app','ap')
abc="Semesters"
sub='e'
print(len(min(xyz)))
print(len(max(xyz)))
print((sub,len(min(xyz)),len(max(xyz))))
print(abc.find(sub,len(min(xyz)),len(max(xyz))))'''

'''n1=['amit','ben','char','dam']
n2=n1
n3=n1[:]
n2[0]='saf'
n3[1]='jhon'
sum=0

for i in (n1,n2,n3):
    if i[0]=='saf':
        sum+=1
    if i[1]=='jhon':
        sum+=10
print(sum)
n3.sort()
#n2.sort()
print(n1,n2,n3)'''
