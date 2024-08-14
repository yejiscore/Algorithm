n = int(input())

if n != 1:
    for i in range(2, int(n**0.5) + 1):
        while n % i == 0:
            print(i)
            n //= i
    # 끝까지 남은 수가 소수일 때
    if n > 1:
        print(n)