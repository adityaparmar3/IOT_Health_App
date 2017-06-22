import Math;
public class CalorieCalculator{
    //height in inches
    double height;
    //age in years
    double age;
    //number of steps taken
    int steps;
    //gender
    String gender;
    //weight in pounds
    double weight; 
    //distance traveled in miles 
    double distance; 
    //stride length 
    double step_length;
    //exercise goals 
    String goal;
    //number of calories needed to be consumed per day
    double daily_calories;
    //activity level daily:
        //if you are stationary throughout the day: 1.1 
        //if you are mildly active throughout the day: 1.2 
        //if you are moderately active in the day: 1.3 
        //if you are extremely active in the day: 1.4
    double activity_level = 1.0;
    //calories burned through steps 
    double step_calories = steps/20;
    //calories left to burn through exercise
    double calories_left;
    //miles left to run
    double miles_run;
    //miles left to walk 
    double miles_walk;
    
    step_length = height * 0.414;
    distance = (step_length  * steps) / 63360;

    //if the user's goal is to lose weight (lose a lb per week)
    if(goal == "Lose_Weight"){
        //if the user is male
        if(gender == "Male"){
            daily_calories = (66.47 + (13.75 * (weight/2.2)) + (5.0 * height * 2.54) - (6.75 * age)) * activity_level - 500;
        }
        //if the user is female
        if(gender == "Female"){
            daily_calories = (665.09 + (9.56 * (weight/2.2)) + (1.84 * height * 2.54) - (4.67 * age)) * activity_level - 500;
        }
        calories_left = 700 - step_calories;
        //calculate the number of miles you have to run
        miles_run = calories_left/(.72 * weight);
        //round it to 2 decimal places
        miles_run = Math.round(miles_run*100.0)/100.0;
        //calculate the number of miles you have to walk
        miles_walk = calories_left/(.57 * weight);
        //round it to 2 decimal places
        miles_walk = Math.round(miles_walk*100.0)/100.0;
    }

    //if the user's goal is to mantain their weight '
     if(goal == "Mantain_Weight"){
        //if the user is male
        if(gender == "Male"){
            daily_calories = (66.47 + (13.75 * (weight/2.2)) + (5.0 * height * 2.54) - (6.75 * age)) * activity_level;
        }
        //if the user is female
        if(gender == "Female"){
            daily_calories = (665.09 + (9.56 * (weight/2.2)) + (1.84 * height * 2.54) - (4.67 * age)) * activity_level;
        }
        calories_left = 500 - step_calories;
        //calculate the number of miles you have to run
        miles_run = calories_left/(.72 * weight);
        //round it to 2 decimal places
        miles_run = Math.round(miles_run*100.0)/100.0;
        //calculate the number of miles you have to walk
        miles_walk = calories_left/(.57 * weight);
        //round it to 2 decimal places
        miles_walk = Math.round(miles_walk*100.0)/100.0;
    }

    //if the user's goal is to gainweight (gain a lb per week)
    if(goal == "Lose_Weight"){
        //if the user is male
        if(gender == "Male"){
            daily_calories = (66.47 + (13.75 * (weight/2.2)) + (5.0 * height * 2.54) - (6.75 * age)) * activity_level + 500;
        }
        //if the user is female
        if(gender == "Female"){
            daily_calories = (665.09 + (9.56 * (weight/2.2)) + (1.84 * height * 2.54) - (4.67 * age)) * activity_level + 500;
        }
        calories_left = 300 - step_calories;
        //calculate the number of miles you have to run
        miles_run = calories_left/(.72 * weight);
        //round it to 2 decimal places
        miles_run = Math.round(miles_run*100.0)/100.0;
        //calculate the number of miles you have to walk
        miles_walk = calories_left/(.57 * weight);
        //round it to 2 decimal places
        miles_walk = Math.round(miles_walk*100.0)/100.0;
    }
    
}
