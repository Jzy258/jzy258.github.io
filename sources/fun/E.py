
def f1(i):
    if i == 0:
        return 1
    else:
        return f1(i-1) * i
# print(f1(4))

def f2(i):
    return 1/(f1(i))
# print(f2(3))

e = 0
n = int(input())
for i in range(n):
    e += f2(i)
print("e=" + str(e))
