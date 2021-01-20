lst = list(input().split())
a=int(lst[0])
b=int(lst[1])
demo = str(a)
r = demo[::-1]
change=int(r)
demo2 = str(b)
r2 = demo2[::-1]
change2 = int(r2)
if change2>change:
  print(change2)
else:
  print(change)