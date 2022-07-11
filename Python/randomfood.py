import random

randomNum = random.randint(0,7)

def restaurants(num):
    switcher = {
        0: "McDonalds",
        1: "Anfora",
        2: "Violetas",
        3: "Taco Bell",
        4: "Tony's Grill",
        5: "Pollo Campero",
        6: "Little Ceaser's",
        7: "Comida China"
    }
    return switcher.get(num, "Nothing")

print (restaurants(randomNum))
