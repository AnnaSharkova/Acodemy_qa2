package homework;

public class Homework {
    public static void main(String[] args) {

//  If int = 10, print "Integer value is 10"

        int x = 10;
        if (x == 10) {
            System.out.println("Integer value is 10");
        }

    }

/* Int = 18-65
If you are 18-21, your discount in dry cleaning is 10%.
If you are 22-65, your discount in dry cleaning is 15%.
If you are older than 65, your discount is 20%.
*/


    public static void main(String[] args) {
        int humanAge = 35;
        if(humanAge >= 18 && humanAge <= 21){
            System.out.println("Your discount im dry cleaning is 10%");
        } else if (humanAge >= 22 && humanAge <= 65){
            System.out.println("Your discount in dry cleaning is 15%");
        } else if (humanAge > 65) {
            System.out.println("You are old human, your discount is 20%");
        } else (humanAge > 18) {
            System.out.println("You are too young human, go away");
        }
    }


//  3.Create array, put into array 10 animals

    String[]animalsArray = {"cat", "dog", "panda", "horse", "pig", "snake", "sheep", "bear", "fox", "bull"};
    System.out.println(animalsArray[6]);


// 4. Write array from 0 to 10, and print even numbers.

        int[] Numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int=0; i<numbers.lenght; i++){
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
}
// 5. I need to go to work, and I need to choose transport.

    String transport = "Taxi";
        switch (transport){
        case "Car":
            System.out.println("I can't drive, i'm ill");
            break;
        case "Bus":
            System.out.println("No, it's too much time");
            break;
        case "Byke":
            System.out.println("Thank you, not today");
            break;
        case "Taxi":
            System.out.println("That's good idea, well done");
            break;
        }


// 6. Print numbers from 1 to 100 on the screen.
       int x = 1;
        while (x>=100); {
        System.out.println(x);
        x++;
        }

// 7. Print numbers from 50 to 1 on the screen.
    int x = 50;
    while (x>=1);{
        System.out.println(x);
        x--;
    }

// 8. Print multiplication table on the screen (from 1 to 100)
}