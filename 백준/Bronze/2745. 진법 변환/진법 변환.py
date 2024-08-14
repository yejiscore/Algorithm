nums = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

n, b = input().split()
b = int(b)
N = len(n)
sum = 0

for i in range(N):
    sum += b**(N-1-i) * nums.index(n[i])

print(sum)