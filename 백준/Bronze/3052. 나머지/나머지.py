remainders = []

for _ in range(10):
  num = int(input())
  num %= 42

  if num not in remainders:
    remainders.append(num)

print(len(remainders))