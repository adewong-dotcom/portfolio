class BMI:
    def __init__(self, gender, age, weight, height) -> None:
        self.gender = gender
        self.age = age
        self.weight = weight
        self.height = height

    def calculate_BMI(self):
        bmi = self.weight / (self.height ** 2)
        return bmi

    def calculate_BMI_lbs(self):
        weight = self.weight/2.2
        bmi = weight / (self.height ** 2)
        return bmi
    
    #Weight status is based off CDC metrics
    # https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/index.html#:~:text=Body%20mass%20index%20(BMI)%20is,square%20of%20height%20in%20meters.
    # Although ethnicity seems to play a role, based on a Harvard study
    # https://www.hsph.harvard.edu/obesity-prevention-source/ethnic-differences-in-bmi-and-disease-risk/
    def weight_status(self):
        bmi = self.calculate_BMI_lbs()
        if bmi < 18.5:
            return "underweight"
        elif bmi >= 18.5 and bmi <= 24.9:
            return "healthy weight"
        elif bmi >= 25.0 and bmi <= 29.9:
            return "overweight"
        else:
            return "obese"
    
        