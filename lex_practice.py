#lex_auth_01269444195664691284

'''def encrypt_sentence(sentence):
    #start writing your code here
    count=1
    j=''
    k=''
    l=''
    list1=list(sentence)
    for i in list1:
        if(i==' ' ):
            j+=i
            if(count%2!=0):
               j+=k[::-1]
            else:
               j+=l
            count+=1
        elif(count%2==0):
            if(str.__contains__('aeiou',i)):
               l+=i
               print("l value : ",l)
            else:
               l+=i  
        else:
            k+=i 
    return j       
       

sentence="The sun rises in the east"
encrypted_sentence=encrypt_sentence(sentence)
print(encrypted_sentence)'''


def find_correct(word_dict):
    correct=0
    almost=0
    wrong=0
    #start writing your code here
    Word=word_dict.keys()
    print(Word)
    
    for i in Word: 
        count=0
        dicWord=word_dict[i]
        list1=list(i)
        list2=list(dicWord)
        length1=len(list1)
        length2=len(list2)
        if(length1<length2):
            l=length2-length1
            count+=l
            for j in range(0,length1):
                if(list1[j]==list2[j]):
                   continue
                else:
                    count+=1  
                    print(count)                   
        elif(length1>length2):
            l=length1-length2
            count+=l
            for j in range(0,length2):
                if(list1[j]==list2[j]):
                   continue
                else:
                    count+=1 
                    print(count)   
        else:
            for j in range(0,length1):
                if(list1[j]==list2[j]):
                   continue
                else:
                    count+=1   
                    print(count)                   
           
        if(count==0):
            correct+=1
        elif(count<=2):
            almost+=1
        else:
            wrong+=1
            
                    
    return [correct,almost,wrong]

word_dict={"THEIR": "THEIR","BUSINESS":"BISINESS","WINDOWS":"WINDMILL","WERE":"WEAR","SAMPLE":"SAMPLE"}
print(find_correct(word_dict))

