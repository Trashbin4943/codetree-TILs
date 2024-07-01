n=int(input())
price=list(map(int,input().split()))

maxprofit=0
for i in range (n):
    for j in range (i+1,n):
        profit = price[j]-price[i]

        if profit>maxprofit:
            maxprofit=profit

print(maxprofit)