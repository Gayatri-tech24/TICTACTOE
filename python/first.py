income=float(input("Enter your income: "))
if income<250000:
    print("No tax")
    print("Amount: ",income)
elif income>=250000 and income<500000:
    income=income- (income*5/100)
    print("5% tax")
    print("Amount: ",income)
elif income>=500000 and income<1000000:
    income=income- (income*20/100)
    print("20% tax")
    print("Amount: ",income)
else:
    income=income-(income*30/100)
    print("30% tax")
    print("Amount: ",income)