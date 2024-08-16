import sys
input = sys.stdin.readline

n = int(input())
stack = []
for _ in range(n):
    command = input().rstrip()

    # 입력 (유일하게 2개 입력되는 명령)
    if len(command) > 2:
        stack.append(int(command[2:]))
    
    # 삭제
    if command == '2':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())
    
    # 개수
    if command == '3':
        print(len(stack))
    
    # 비어있는지
    if command == '4':
        print(1 if len(stack) == 0 else 0)
    
    # 정수 있다면
    if command == '5':
        print(stack[-1] if len(stack) != 0 else -1)