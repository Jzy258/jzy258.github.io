
pi = 0
for a in range(10000000):
    pi += (4/(4*a+1))-(4/(4*a+3))
print(pi)
