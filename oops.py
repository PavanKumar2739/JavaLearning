#oops concept
#blue print for Bottle 'all dimentions are in mm'
color="white"
height=250
width=70
length=40
def wash(a):
    print(a)
    print('it can be washed and clean')
def fitCap():
    print('we can close the cap')
def fillLiquid():
    print('we can fill liquids')
    
#class ( blue print of bottle )

wash(10)

class Bottle():
#properties/attributes/state
    color="white"
    height=250
    width=70
    length=40
    #behavior/function
    def wash(self,a):
        print('a')
        print('it can be washed')
        print('wash',a)
        print('capacity cmd',self.capacity)
    def fitCap(q):
        print('we can close the cap and good')
        return 'pavan'
    def fillLiquid():
        print('we can fill liquids')
    def __init__(self,col,cap):
        self.color=col
        self.capacity=cap
        print('b')
    def __del__(q):
        print('destructor')
#object creation



print('====inheritance====')
class copperBottle(Bottle):
    def health(s):
        print('make water healthy')
    def fitCap(q):
        print('we can close the cap 1')
        return 'pavan 1'
    
print(copperBottle.height)
b4=copperBottle('green',3)
b4.wash(10)
 
#print(__name__)

b2=Bottle('white',4)
b1=copperBottle('green',3)
b1.fitCap()
print(b1.color)
b1.wash(6) 
wash(10)