n=int(input())
price=list(map(int,input().split()))
buy=min(price)
n=price.index(buy)

margin=[]
for i in price[n+1:]:
    if i-buy>0:
        margin.append(i-buy)
    else:
        pass

if margin!=[]:
    print(max(margin))
else:
    print(0)