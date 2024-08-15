n = int(input())

# 5kg 봉지로만 담기
if n % 5 == 0:
    print(n // 5)

else:
    cnt = 0
    while n > 0:
        n -= 3
        cnt += 1

        # 5kg 3kg 섞어서 담기
        if n % 5 == 0:
            cnt += (n // 5)
            print(cnt)
            break

        # 3kg 봉지로만 담기
        elif n == 0:
            print(cnt)
            break

        # 못 담음
        elif n == 1 or n == 2:
            print(-1)
            break