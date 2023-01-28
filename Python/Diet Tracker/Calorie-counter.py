from Food import *
from BMI import *
from Calorie_Intake_Recommender import *
#import mysql.connector

'''This will implement a knapsack problem to evaluate the amount of calories
 that will be consumed per day.'''

'''mydb = mysql.connector.connect(
     host="localhost",
     user="yourusername",
     password = "yourpassword"
 )

mycursor = mydb.cursor()

mycursor.execute("CREATE DATABASE mydatabase")
'''

person_1 = BMI("female", 34, 231, 1.68)
person_2 = BMI("male", 41, 250, 1.82)

bmi_status_p1 = person_1.weight_status()
bmi_status_p2 = person_2.weight_status()

calorie_recommendation_p1 = Calorie_Intake_Recommender.recommender(person_1.age, bmi_status_p1, person_1.gender)
calorie_recommendation_p2 = Calorie_Intake_Recommender.recommender(person_2.age, bmi_status_p2, person_2.gender)

print(calorie_recommendation_p1)
print(calorie_recommendation_p2)