import java.util.Scanner;

public class Game{
    public static void main (String args []){


        Scanner userInput = new Scanner (System.in);

        System.out.println(
        "\n _______________________________________________________________" +
        "\n" +
        "\n WELCOME TO THE ADVENTURE" +
        "\n" +
        "\n _______________________________________________________________");

        System.out.println("\n Name your characther: \n");

        String name = userInput.nextLine(); 

        PlayerClass newPlayer = new PlayerClass(name);

        System.out.println("\n Welcome to the game " + name +
        "\n" +
        "\n _______________________________________________________________");

        System.out.println("\n Chose your race: " +
        "\n" +
        "\n Option 1: Elf" +
        "\n Option 2: Dwarf" +
        "\n Option 3: Human" +
        "\n Option 4: Halfling " +

        "\n _______________________________________________________________"
      
        );

        int race = userInput.nextInt(); 
        newPlayer.raceType(race);

          // Select race again 
          
          System.out.println("\n Are you happy with your choice? " +
          "\n" +
          "\n 1 - YES" +
          "\n 2 - NO, I want to pick again!" +
          "\n _______________________________________________________________" 
          
          );

      int raceChoice = userInput.nextInt(); 

         if (raceChoice == 2){

            System.out.println("\n Chose your race: " +
            "\n" +
            "\n Option 1: Elf" +
            "\n Option 2: Dwarf" +
            "\n Option 3: Human" +
            "\n Option 4: Halfling " +
    
            "\n _______________________________________________________________"
          
            );
    
            int newrace = userInput.nextInt(); 
            newPlayer.raceType(newrace);

         }

         else{   System.out.println("Great, let's continue then! " +
         "\n _______________________________________________________________" 
         
         );}


        System.out.println("\n Select a profession for your character: " +
        "\n" +        
        "\n Option 1 : Warrior" +          
        "\n Option 2 : Merchant" +           
        "\n Option 3 : Assassin" +
        "\n Option 4 : Magician" +
        "\n _______________________________________________________________" 
        );


        int profession = userInput.nextInt(); 
        newPlayer.professionType(profession);

           // Select profession again 
        System.out.println("\n Are you happy with your choice? " +
            "\n" +
            "\n 1 - YES" +
            "\n 2 - NO, I want to pick again!" +
            "\n _______________________________________________________________" 
            
            );

        int professionChoice = userInput.nextInt(); 

           if (professionChoice == 2){

            System.out.println("\n Select a profession for your character: " +
            "\n" +        
            "\n Option 1 : Warrior" +          
            "\n Option 2 : Merchant" +           
            "\n Option 3 : Magician" +
            "\n Option 4 : Assassin" +
            "\n _______________________________________________________________" 
            );

            int newProfession = userInput.nextInt(); 
            newPlayer.professionType(newProfession);

           }

           else{   System.out.println("Great, let's continue then! " +
           "\n _______________________________________________________________" 
           
           );}


        System.out.println("\n Now, you can modify some attributes of your characther: " +
        "\n" +
        "\n Option 1 : +3 strength  and - 2 inteligence" +          
        "\n Option 2 : +2 wisdom 	and - 1 inteligence" +           
        "\n Option 3 : +3 wisdom    and - 2 strength" +
        "\n Option 4 : +2 wisdom    and + 1 inteligence but - 4 Strength" +
        "\n Option 5 : I'm happy with my characther!" +

        "\n _______________________________________________________________"
      
        );

        int modifier = userInput.nextInt(); 
        newPlayer.modifiers(modifier);
        
        userInput.close();


    }

}


