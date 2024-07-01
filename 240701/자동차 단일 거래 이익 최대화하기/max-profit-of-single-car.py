n=int(input())
price=list(map(int,input().split()))
buy=min(price)
del price[0:price.index(buy)+1]

if price!=[]:
    sell=max(price)
else:
    sell=buy
margin=sell-buy

if margin>0:
    print(margin)
else:
    print(0)