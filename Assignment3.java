import java.util.Scanner;

//1. Write a JAVA program to find maximum between two numbers
public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scan.nextInt();
        System.out.println("Enter a number:");
        int b=scan.nextInt();
        if (a > b) {
            System.out.println(a+ " is largest");
        }else {
            System.out.println(b+" is largest");
        }
    }
}


//2. Write a JAVA program to find maximum between three numbers.
class Max3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scan.nextInt();
        System.out.println("Enter a number:");
        int b=scan.nextInt();
        System.out.println("Enter a number:");
        int c=scan.nextInt();
        if (a > b&&a>c) {
            System.out.println(a+ " is largest");
        }else if (b>c&&b>a) {
            System.out.println(b+" is largest");
        }else{
            System.out.println(c+ " is largest");
        }
    }
}

//3. Write a JAVA program to check whether a number is negative, positive or zero.
class Check{
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=number.nextInt();
        if (0 > a) {
            System.out.println("Negative");
        } else if (0 < a) {
            System.out.println("Positive");
        }else{
            System.out.println("Zero");
        }
    }
}

//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
class Divide{
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=number.nextInt();

        if ((a % 5==0) && (a % 11==0)) {
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }
    }
}


//5. Write a JAVA program to check whether a number is even or odd.
class Checks{
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=num.nextInt();

        if (a % 2 == 0) {
            System.out.println("Can be divisible by 2");
        }else{
            System.out.println("Cannot be divisible by 2");
        }
    }
}

//6. Write a JAVA program to check whether a year is leap year or not.
class Leap{
    public static void main(String[] args) {
        Scanner date=new Scanner(System.in);
        System.out.print("Year:");
        int year=date.nextInt();
        boolean leap=false;

        if (year % 4 == 0) {
            if (year % 100 ==0) {
                if (year % 100 == 0) {
                    leap=true;
                }else{
                    leap=false;
                }
            }else{
                leap=true;
            }
        }else{
            leap=false;
        }
        if (leap) {
            System.out.println(year+ " is a leap year.");
        }else{
            System.out.println(year+ " is not a leap year.");
        }
    }
}

//7. Write a JAVA program to check whether a character is alphabet or not.
class Alphabet{
    public static void main(String[] args) {
        Scanner any=new Scanner(System.in);
        System.out.println("Alphabet? :");
        char insert=any.next().charAt(0);

        if ((insert>='A')&&(insert<='Z')||((insert>='a')&&(insert<='z'))){
            System.out.println(insert+ " is an Alphabet");
        }else{
            System.out.println(insert+" is not an Alphabet");
        }
    }
}
//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class vowel{
    public static void main(String[] args) {
        Scanner consonant= new Scanner(System.in);
        System.out.print("Enter a word: ");
        char word=consonant.next().charAt(0);
        if (word=='a'||word=='e'||word=='i'||word=='o'||word=='u'){
            System.out.println(word+ " is vowel");
        }else{
            System.out.println(word+ " is consonant");
        }
    }
}

//9. Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
class Confused{
    public static void main(String[] args) {
        Scanner character=new Scanner(System.in);
        System.out.println("Input a character: ");
        char insert=character.next().charAt(0);
        if ((insert>='a'&& insert<='z')||(insert>='A'&&insert<='Z')){
            System.out.println(insert+ " is alphabet");
        }else if((insert>='0'&&insert<='9')){
            System.out.println(insert+ " is a Number");
        }else{
            System.out.println(insert+ " is a special character");
        }
    }
}

//10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class Upper{
    public static void main(String[] args) {
        Scanner word= new Scanner(System.in);
        System.out.println("Enter a word: ");
        char alphebt= word.next().charAt(0);
        if (alphebt>='a'&&alphebt<='z'){
            System.out.println(alphebt+ " is a lowercase alphabet");
        }else{
            System.out.println(alphebt+ " is a uppercase alphabet");
        }
    }
}

//11. Write a JAVA program to input week number and print weekday.
class Week{
    public static void main(String[] args) {
        Scanner day=new Scanner(System.in);
        System.out.println("Enter week number: ");
        int daynum= day.nextInt();

        if (daynum==1){
            System.out.println("Sunday");
        } else if (daynum==2) {
            System.out.println("Monday");
        } else if (daynum==3) {
            System.out.println("Tuesday");
        } else if (daynum==4) {
            System.out.println("Wednesday");
        } else if (daynum==5) {
            System.out.println("Thursday");
        } else if (daynum==6) {
            System.out.println("Friday");
        } else if (daynum==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("A week has only 7 days.");
        }
    }
}

//12. Write a JAVA program to input month number and print number of days in that month.
class Months{
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter Month number: ");
        int monthn= number.nextInt();

        if (monthn==1){
            System.out.println(monthn+ " is January and has 31 days a month");
        } else if (monthn==2) {
            System.out.println(monthn+ " is February and has 28 days a month");
        } else if (monthn==3) {
            System.out.println(monthn+ " is March and has 31 days a month");
        } else if (monthn==4) {
            System.out.println(monthn+ " is April and has 30 days a month");
        } else if (monthn==5) {
            System.out.println(monthn+ " is May and has 31 days a month");
        } else if (monthn==6) {
            System.out.println(monthn+ " is June and has 30 days a month");
        } else if (monthn==7) {
            System.out.println(monthn+ " is July and has 31 days a month");
        }else if (monthn==8) {
            System.out.println(monthn+ " is August and has 31 days a month");
        } else if (monthn==9) {
            System.out.println(monthn+ " is September and has 30 days a month");
        } else if (monthn==10) {
            System.out.println(monthn+ " is October and has 31 days a month");
        } else if (monthn==11) {
            System.out.println(monthn+ " is November and has 30 days a month");
        } else if (monthn==12) {
            System.out.println(monthn+ " is December and has 31 days a month");
        } else {
            System.out.println("A year has only 12 months.");
        }
    }
}


//13. Write a JAVA program to count total number of notes in given amount.
class Money{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Denomination");
//        int Denomination=sc.nextInt();
        System.out.print("Amount:");
        int amount=sc.nextInt();

        while(amount>0){
            if (amount >= 1000) {
                System.out.println("No. of 1000 notes:" +amount/1000);
                amount=amount%1000;

            }else if(amount>=500){
                System.out.println("No.of 500 notes: "+amount/500);
                amount=amount%500;

            }else if (amount>=100){
                System.out.println("No. of 100 notes: "+amount/100);
                amount=amount/100;

            }else if (amount>50){
                System.out.println("No. of 50 notes: "+amount/50);
                amount=amount/50;

            }else if (amount>20){
                System.out.println("No, of 20 notes:" +amount/20);
                amount=amount/20;

            }else if (amount>10){
                System.out.println("No. of 10 notes:"+amount/10);
                amount=amount/10;

            }else if (amount>5){
                System.out.println("No. of 5 notes:"+amount/5);
                amount=amount/5;

            } else if (amount > 2) {
                System.out.println("No. of 2 notes:"+amount/2);
                amount=amount/2;

            }else {
                System.out.println("No.of 1 notes: " + amount / 1);
                amount = amount % 1;
            }
        }
    }
}

//14. Write a java program to input angles of a triangle and check whether triangle is valid or not.
class angleoftriangle{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter first angle");
        int angl1 = myobj.nextInt();
        System.out.println("Enter second angle");
        int angle2= myobj.nextInt();
        System.out.println("Enter third angle");
        int angle3= myobj.nextInt();
        int total=angl1+angle2+angle3;
        if (total==180){
            System.out.println("it is valid triangle");
        }
        else
            System.out.println("it is not valid traingle");
    }
}

//15. Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
class sideoftriangle{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = myobj.nextInt();
        System.out.println("Enter second side");
        int b = myobj.nextInt();
        System.out.println("Enter third side");
        int c = myobj.nextInt();
        if(a<b+c && b<a+c && c<a+b){
            System.out.println("It can form traingle");
        }
        else{
            System.out.println("It cannot form traingle");
        }

    }
}


//16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
class traingle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 sides:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<b+c && b<a+c && c<a+b)
        {
            if(a==b && b==c)
                System.out.println("Equilateral triangle");
            else if(a==b || b==c || c==a)
                System.out.println("Isosceles triangle");
            else
                System.out.println("Scalene triangle");
        }
        else
            System.out.println("Cannot form a triangle");
    }
}


//17. Write a JAVA program to find all roots of a quadratic equation.
class quadratic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}


//18. Write a JAVA program to calculate profit or loss.
class profitlostt{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter Selling price");
        float sell = myobj.nextFloat();
        System.out.println("Enter Cost price");
        float cost = myobj.nextFloat();
        float profit;
        float loss;
        if(cost-sell>0){
            System.out.println("lose:"+(cost-sell));
        }
        else if(cost-sell<0) {
            System.out.println("profit:"+(sell-cost));

        }
        else{
            System.out.println("neutral");
        }

    }
}


//19. Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
//Mathematics and Computer. Calculate percentage and grade according to following:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
class studentmark{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter Your Physics Mark:");
        int phy = myobj.nextInt();
        System.out.println("Enter Your Chemistry Mark:");
        int chem = myobj.nextInt();
        System.out.println("Enter Your Biology Mark:");
        int bio = myobj.nextInt();
        System.out.println("Enter Your Mathematics Mark:");
        int math = myobj.nextInt();
        System.out.println("Enter Your Computer Mark:");
        int comp = myobj.nextInt();
        float total, Percentage;
        total = phy + chem + bio + comp + math;
        Percentage = (total / 500) * 100;
        System.out.println("Your total percentage is:"+Percentage);
        if(Percentage >= 90)
        {
            System.out.println("\n Grade A");
        }
        else if(Percentage >= 80)
        {
            System.out.println("\n Grade B");
        }
        else if(Percentage >= 70)
        {
            System.out.println("\n Grade C");
        }
        else if(Percentage >= 60)
        {
            System.out.println("\n Grade D");
        }
        else if(Percentage >= 40)
        {
            System.out.println("\n Grade E");
        }
        else
        {
            System.out.println("\n Fail");
        }

    }
}




