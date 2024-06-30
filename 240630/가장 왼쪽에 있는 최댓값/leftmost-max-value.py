n=int(input())
numli=list(map(int,input().split()))

for i in range (n):
    least=numli[0]
    idxx=[]
    for j in numli[1:n+1]:
        if j>=least:
            least=j

idxx.append(numli.index(least))
if numli.count(least)>=2:
    print(idxx[0]+1,end=" ")
else:
    print(idxx[0]+1,end=" ")

n=idxx[0]
least2=numli[0]
for k in numli[1:n]:
    if k>least2:
        least2=k

idxx2=[]
idxx2.append(numli.index(least2))
if least==least2:
    print(" ")
elif numli.count(least2)>=2:
    print(idxx2[0]+1)
else:
    print(idxx2[0]+1)