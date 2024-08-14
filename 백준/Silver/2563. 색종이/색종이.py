grid = [[0] * 100 for _ in range(100)]

n = int(input())

for _ in range(n):
    x, y = map(int, input().split())
    
    for i in range(x, x + 10):
        for j in range(y, y + 10):
            grid[i][j] = 1

print(sum(sum(g) for g in grid))