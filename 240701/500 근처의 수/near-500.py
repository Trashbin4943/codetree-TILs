numli=list(map(int,input().split()))
less=[]
more=[]
for i in numli:
    if i<500:
        less.append(i)
    elif i>500:
        more.append(i)
less.sort(reverse=True)
more.sort()

print(less[0],end=" ")
print(more[0],end=" ")