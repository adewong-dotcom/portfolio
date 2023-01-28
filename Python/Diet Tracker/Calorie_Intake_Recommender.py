class Calorie_Intake_Recommender:
    def __init__(self) -> None:
        pass
    
    def recommender(age, weight_status, gender):
        # Calorie recommendations based on heart.org and healthline
        # https://www.heart.org/en/healthy-living/healthy-eating/eat-smart/nutrition-basics/dietary-recommendations-for-healthy-children
        #
        # Still needs to be finetuned to ensure accuracy
        calorie_recommendations_c = [[1200, 1400], [1600, 1800], [1800, 2200]]
        calorie_recommendations_w = [[1500, 1600, 2000, 2500],[1300, 1400, 1800, 2300],[1100, 1200, 1600, 2100]]
        calorie_recommendations_m = [[1900, 2000 ,2400, 3100],[1700, 1800, 2200, 3100],[1500, 1600, 2000, 2700]]

        recommended_calories = None
        if age <= 18:
            if age >= 4 and age <= 8:
                recommended_calories = calorie_recommendations_c[0]
            elif age >= 9 and age <= 13:
                recommended_calories = calorie_recommendations_c[1]
            elif age >= 14 and age <= 18:
                recommended_calories = calorie_recommendations_c[2]
        elif age >= 19 and age <=30:
            recommended_calories = calorie_recommendations_w[0] if gender == "female" else calorie_recommendations_m[0]
        elif age >= 31 and age <=59:
            recommended_calories = calorie_recommendations_w[1] if gender == "female" else calorie_recommendations_m[1]
        else:
            recommended_calories = calorie_recommendations_w[2] if gender == "female" else calorie_recommendations_m[2]
        
        if age <=18:
            recommended_calories = recommended_calories[0] if gender == "female" else recommended_calories[1]
        elif weight_status == "obese":
            recommended_calories = recommended_calories[0]
        elif weight_status == "overweight":
            recommended_calories = recommended_calories[1]
        elif weight_status == "healthy weight":
            recommended_calories = recommended_calories[2]
        elif weight_status == "underweight":
            recommended_calories = recommended_calories[3]
        
        return recommended_calories