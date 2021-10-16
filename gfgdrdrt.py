import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import sys
df=pd.read_csv("C:\\Users\\S K SAHA\\Desktop\\SPORTSacademy.csv")
df.set_index("EQUIPNO",inplace=True)
pd.set_option('display.max_columns',None)
print(df)
def display():
    print("Display Equipment")
    print("1.All the Equipment records")
    print("2.Show number of top records")
    print("3.Show number of bottom records")
    print("4.As per user choice")
    print("5.Go back to main menu")
    print("6.Exit")
    n=int(input("Enter choice"))
    if n==1:
        print(df)
    elif n==2:
        no=int(input("How many Equipment to display"))
        print(df.head(no))
    elif n==3:
        a=int(input("How many Equipment to display"))
        print(df.tail(a))
    elif n==4:
        b=(input("EQUIPNO From:"))
        c=(input("To:"))
        print(df.loc[b:c])
    elif n==5:
        main()   
    elif n==6:
        sys.exit()
    else:
        print("Invalid Input")
        sys.exit()
def add():
    print("Module for Adding New Equipment")
    print("1.Adding a new Equipment Detail")
    print("2.Adding a new equipment")
    print("3.Go back to main menu")
    print("4.Exit")
    n=int(input("Enter choice"))
    if n==1:
        print(df.columns)
        col=input("Enter column you want to add")
        l=list()
        c=df[["EQUIPNAME"]].count(0)[0]
        #print(c)
        for i in range(c):
            n=(input("Enter values:"))
            l.append(n)
        df[col]=l
        print(df)
    elif n==2:
        a=list(df.columns)
        l=list()
        k=input("Enter the EQUIPNO to be inserted")
        print(df.columns)
        m=a
        for i in range(len(m)):
            n=input("Enter the details for EQUIPNO {}")
            l.append(n)
        df.at[k,:]=l
        print("New row Inserted")
        print(df)
        print()
    elif n==3:
        main()   
    elif n==4:
        sys.exit()
    else:
        print("Invalid Input")
        sys.exit()
def update():
    print(df)
    print("Module for updating records")
    print("Name of Columns")
    print(df.columns)
    col=input("Enter column to update:")
    roll=(input("Enter EQUIPNO to update:"))
    value=input("Enter value")
    df.loc[roll,col]=value
    print(df)
    main()
def delete():
    print(df)
    print("Module for dismantling the Equipment")
    roll=(input("Enter EQUIPNO to delete:"))
    df1=df.drop(roll)
    print(df1)
    main()
def plot():
    print("Which type of chart you want to display")
    print("1. Line")
    print("2. Bar")
    print("3.Go Back To Main Menu")
    f=int(input("Enter your choice"))
    if f==1:
        print("You want the graph of")
        print("1. Stock available Ename wise")
        print("2. SP of all equipments")
        print("3. CP of all equipments")
        m=int(input("Enter your choice"))
        print()
        if m==1:
            plt.plot(df['EQUIPNAME'],df['QTY'])
            plt.title("Stock Available")
            plt.xlabel('EQUIPNAME')
            plt.ylabel('QTY')
            plt.show()
        elif m==2:
            plt.plot(df['EQUIPNAME'],df['SP'])
            plt.title("Selling Price")
            plt.xlabel('EQUIPNAME')
            plt.ylabel('SP')
            plt.show()
        elif m==3:
            plt.plot(df['EQUIPNAME'],df['CP'])
            plt.title("Cost Price")
            plt.xlabel('EQUIPNAME')
            plt.ylabel('CP')
            plt.show()
        else:
            print()
            print("INVALID INPUT")
            sys.exit()
    elif f==2:
        print("You want the graph of")
        print("1. Stock available Ename wise")
        print("2. SP of all equipments")
        print("3. CP of all equipments")
        m=int(input("Enter your choice"))
        print()
        if m==1:
            plt.bar(df['EQUIPNAME'],df['QTY'])
            plt.title("Stock Available")
            plt.xlabel('EQUIPNAME')
            plt.ylabel('QTY')
            plt.show()
        elif m==2:
            plt.bar(df['EQUIPNAME'],df['SP'])
            plt.title("Selling Price")
            plt.xlabel('EQUIPNAME')
            plt.ylabel('SP')
            plt.show()
        elif m==3:
            plt.bar(df['EQUIPNAME'],df['CP'])
            plt.title("Cost Price")
            plt.xlabel('EQUIPNAME')
            plt.ylabel('CP')
            plt.show()
        else:
            print()
            print("INVALID INPUT")
            sys.exit()
    elif f==3:
        print("thanks for visiting")
        sys.exit()
    else:
        print("INVALID INPUT")
        sys.exit()
def main():
    print("SPORTS PARADISE")
    print("*"*50)
    print("1.Display the Equipment details")
    print("2.Add Equipment to Inventory")
    print("3.Update Inventory")
    print("4.Delete Equipment")
    print("5.Current status Equipment Graph")
    print("6.Exit")
    choice=int(input("Enter Your Choice:"))
    while True:
        if choice==1:
            display()
        elif choice==2:
            add()
        elif choice==3:
            update()
        elif choice==4:
            delete()
        elif choice==5:
            plot()
        elif choice==6:
            sys.exit() 
        else:
            print("Invalid Input")
            break
main()
