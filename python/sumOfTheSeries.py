from tkinter import N


def sumOfTheSeries(num,n):
    sum=0
    num1=num
    for i in range(0,n):
        sum+=num
        num=(num*10)+num1
    print(sum)

sumOfTheSeries(2,5)