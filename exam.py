'''var =21
print(var+'pavan')'''

print("+==========================+")

x=[40,876,3553,22]
y=x[:]
y.sort()
print(y[2],x[2])

print("+==========================+")

import re

a="Paaviann"
x=re.findall("a",a)
print(x)

x=re.search('Pa',a)
print(x)
print(x.span())
print(x.string)
print(x.start())

x=re.split("a",a)
print(x[2])

print("+==========================+")

import math

print(math.floor(5.7))

print("+==========================+")

ab='pavan'
ab=5
print(ab)

print("+==========================+")

import random

print(random.randrange(4,7))

print("+==========================+")

num=5
while(~-num):
    num= num-1
    print(num)
    
print("+==========================+")
 
print(re.sub('a','*',a,2))

print("+==========================+")

xyz={'apple','applets','app'}
abc="assassination"
sub='s'
print(abc.replace('s','S',len(min(xyz))))

'''print(3*1**3)

class mul:
    def __init__(self,fac):
        self.fac=fac
    def mult1(self,arg):
        return arg*self.fac
def gen_mul(fac):
    return mul(fac).mult1
    
    
twice=gen_mul(2)
print(twice(5))


class mul1:
    def mult2(self):
        print("pavan")
class gen_mul1(mul1):
    def __init__(self):
        print("kumar")
    
p=gen_mul1()
p1=mul1()
p1.mult2()
p.mult2()

print("+==========================+")
print("+==========================+")
class mull:
    def __init__(self,fac):
        self.fac=fac
        id=999
        
id=mull(101)
print(id.fac)
print("+==========================+")
print("+==========================+")
op=range(4,11,2)
print(op)

lang_add={}

def language(lang):
    if lang in lang_add:
        lang_add[lang]+=1
    else :
        lang_add[lang]=1
        
language('pHp')
language('python')
language('php')
language('perl')

print(len(lang_add))'''