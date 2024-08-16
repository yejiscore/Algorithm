import sys

n = int(input())

co = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

co.sort(key = lambda x: (x[0], x[1]))

for i in co:
    print(i[0], i[1])