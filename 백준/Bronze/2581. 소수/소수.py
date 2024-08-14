M = int(input())
N = int(input())
result = []

for i in range(M, N+1):
  if i < 2:
        continue
  for j in range(2, i + 1):
    if i % j == 0:
      if i == j:
        result.append(i)
      break

if result:
  print(sum([x for x in result]))
  print(min(result))
  
else:
  print(-1)