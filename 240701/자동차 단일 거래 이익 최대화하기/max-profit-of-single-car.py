n=int(input())
price=list(map(int,input().split()))

buy=min(price)
m=price.index(buy)

marg1=[]
for i in price[m+1::]:
    if i-buy>0:
        marg1.append(i-buy)

sell=max(price)
marg2=[]
n=price.index(sell)
for j in price[0:n]:
    if sell-j>0:
        marg2.append(sell-j)

if marg1 and marg2:
    if max(marg1)>max(marg2):
        print(max(marg1))
    elif max(marg1)<max(marg2):
        print(max(marg2))
elif marg1:
    print(max(marg1))
elif marg2:
    print(max(marg2))
else:
    print(0)