n=[1,2,5,7,9,10,15,20]
e=6
for i in range(len(n)):
    if n[i]<e:
        continue
    if n[i]>e:
        n.insert(i,e)
        break
print(n)