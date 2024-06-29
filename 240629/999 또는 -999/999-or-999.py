numv=list(map(int,input().split()))

for i in numv:
    if i==999 or i==-999:
        a=numv.index(i)
        del numv [a:]

print(max(numv),end=" ")
print(min(numv))