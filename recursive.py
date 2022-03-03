
def recursive(num, count):

    while True:
        if count == 0:
            print('Done!')
            break
        elif num%2 == 0:
            print(num)
            num= num/2 
            count -= 1
        else:
            print(num)
            num = num*3+1
            count -= 1

number = input("Enter any number as long as it's not a power of 2:  ")
val = int(number)
counting = 30
recursive(val, counting)

