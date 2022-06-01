import random
num = random.randint(1,1000)
steps = 0
while 1:
    numIn = int(input("Guess: "))
    steps += 1
    if numIn == num:
        print("Congratulations! You've succeeded in " + str(steps) + " steps! ")
        break
    elif numIn < num:
        print("Too low! ")
    else:
        print("Too high! ")
