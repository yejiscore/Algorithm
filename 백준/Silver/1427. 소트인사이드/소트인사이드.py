n = int(input())
nums = []

while True:
  if n != 0:
    nums.append(n % 10)
    n //= 10
  else:
    break

nums.sort(reverse=True)
print(*nums, sep="")