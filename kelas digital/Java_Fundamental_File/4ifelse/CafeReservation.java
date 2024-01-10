import java.util.Scanner;
public class CafeReservation {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name, gender, dayReservation;
        int age,attractive,money;


        System.out.println("Welcome To Reservation Cafe");
        System.out.println("Please insert your Name?");
        name = keyboard.next();
        System.out.println("How old are you?");
        age = keyboard.nextInt();
        System.out.println("What is your gender?");
        gender = keyboard.next();
        System.out.println("How attractive are you? (1 to 10)");
        attractive = keyboard.nextInt();
        System.out.println("How much money do you have?");
        money = keyboard.nextInt();
        System.out.println("What day do you want to make a reservation?");
        dayReservation = keyboard.next();

        if(dayReservation.equalsIgnoreCase("Monday")){
            if(age >= 20 && age <=30){
                if(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female")){
                    if(money >=500){
                        System.out.println("Hi "+name + ", Thank you for using our Application. Following Result for your Reservation");
                        System.out.println("Congrats, its Young Night! Your reservation day is Monday!!");
                    }else{
                        System.out.println("Sorry your money is not enough for the reservation");
                    }
                }
            }else{
                System.out.println("Im sorry your age is not allowed to take reservation in monday");
            }
        }else if(dayReservation.equalsIgnoreCase("Tuesday")){
             if(age >= 31 && age <=50){
                if(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female")){
                    if(money >=250){
                        System.out.println("Hi "+name + ", Thank you for using our Application. Following Result for your Reservation");
                        System.out.println("Congrats, its Oldest Night. Your reservation day is Tuesday!!");
                    }else{
                        System.out.println("Sorry your money is not enough for the reservation");
                    }
                }
            }else{
                System.out.println("Im sorry your age is not allowed to take reservation in Tuesday");
            }
        }else if(dayReservation.equalsIgnoreCase("Wednesday")){
             if(age >= 20 && age <=35){
                if(gender.equalsIgnoreCase("Female")){
                    if(attractive >= 8 && attractive <= 10){
                        if(money >=300){
                        System.out.println("Hi "+name + ", Thank you for using our Application. Following Result for your Reservation");
                        System.out.println("Congrats, its Ladies Night. Your reservation day is Wednesday!!");
                        }else{
                        System.out.println("Sorry your money is not enough for the reservation");
                        }
                    }else{
                        System.out.println("Sorry you cant have the reservation because you're not attractive enough");
                    }
                }else{
                    System.out.println("Sorry, you can't order on Wednesday!!. Because it is for Ladies Night");
                }
            }else{
                System.out.println("Im sorry your age is not allowed to take reservation in Wednesday");
            }
        }else if(dayReservation.equalsIgnoreCase("Thursday")){
             if(age >= 21 && age <=30){
                if(gender.equalsIgnoreCase("Female")){
                    if(attractive >= 8 && attractive <= 10){
                        if(money >=300){
                        System.out.println("Hi "+name + ", Thank you for using our Application. Following Result for your Reservation");
                        System.out.println("Congrats, its Party Night For Single!. Your reservation day is Thursday!!");
                        }else{
                        System.out.println("Sorry your money is not enough for the reservation");
                        }
                }else{
                        System.out.println("Sorry you cant have the reservation because you're not attractive enough");
                }
            }else if(gender.equalsIgnoreCase("Male")){
                        if(money >=1000){
                        System.out.println("Hi "+name + ", Thank you for using our Application. Following Result for your Reservation");
                        System.out.println("Congrats, its Party Night for Single!. Your reservation day is Thursday!!");
                        }else{
                        System.out.println("Sorry your money is not enough for the reservation");
                        }    
                }
            }else{
                System.out.println("Im sorry your age is not allowed to take reservation in Wednesday");
        }
        }else if(dayReservation.equalsIgnoreCase("Friday")){
            if(gender.equalsIgnoreCase("Female")){
                if(age >= 31 && age <=45){
                    if(attractive >= 8 && attractive <=10){
                        if(money>=1000){
                             System.out.println("Hi "+name + ", Thank you for using our Application. Following Result for your Reservation");
                        System.out.println("Congrats, Women Night! Your reservation day is friday!!");
                        }else{
                             System.out.println("Sorry your money is not enough for the reservation");
                        }
                    }
                }else{
                    System.out.println("Im sorry your age is not allowed to take reservation in friday");
                }
            }else if(gender.equalsIgnoreCase("Male")){
                if(age >=21 && age <=25){
                    //hmm aneh judul nya women night tetapi ada male age
                    if(attractive >= 8 && attractive <=10){
                        System.out.println("Hi "+name + ", Thank you for using our Application. Following Result for your Reservation");
                        System.out.println("Congrats, Women Night! Your reservation day is friday!!");
                    }
                }
            }
        }else if(dayReservation.equalsIgnoreCase("Saturday")){
            if((age >=18 && age <=60) && money>= 100){
                 System.out.println("Hi "+name + ", Thank you for using our Application. Following Result for your Reservation");
                 System.out.println("Congrats, Weekend Freedom! Your reservation day is Saturday!!");
            }else{
                if(age < 18 && age > 60){
                    System.out.println("Im sorry your age is not allowed to take reservation in Saturday");
                }else{
                    System.out.println("Sorry your money is not enough for the reservation");
                }
            }
        }
    }
}
