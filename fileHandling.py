#file handling
#file=open('pavan','r')
'''file = open('pavan.txt','w')

print(file)
p=['pavan','kumar','yadav']
file.writelines('pavan is good fellow')
end=''
#file.write('pavan','kumar','yadav') show error
file.writelines(p) 
#file.write(p)'''
'''file=open('pavan.txt','r')
print(file.read())
'''
#by using with addin new txt in file
with open('pavan.txt','w') as file:
    file.write('happy')