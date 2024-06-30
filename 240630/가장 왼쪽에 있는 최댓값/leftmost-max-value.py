n=int(input())
numli=list(map(int,input().split()))

while numli!=[]:
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
    
    del numli[idxx[0]::]