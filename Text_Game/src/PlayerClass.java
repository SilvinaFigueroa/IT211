
public class PlayerClass {
    private String name; 

    private String race ="Non defined";
    private int inteligence = 0;
    

    private String profession;
    private int strength = 0;
    private int wisdom = 0;
    
    
    // Constructor 
    // Character mandatory attribute: Name

    PlayerClass(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace(){
        return race;
    }

    public void setRace(String race){
       this.race = race;

    }

    public void raceType (int optionRace){
        switch(optionRace){
            
            case 1: this.race = "Elf";
            inteligence = 5;
            break;
            
            case 2: this.race = "Dwarf";
            inteligence = 4;
            break;

            case 3: this.race = "Human";
            inteligence = 9;
            break;

            case 4: this.race = "Halfling";
            inteligence = 2;
            break;
        }

        System.out.println("\n Great, this is how your character looks like so far: " +
        "\n" +
        "\n Name: " + this.name +
        "\n     Race: " + this.race +
        "\n             Inteligence: " + this.inteligence +

        "\n _______________________________________________________________"
        
        );


     } 

        
     public void professionType (int optionProfession){
        switch(optionProfession){
            
            case 1: this.profession = "Warrior";
            strength = 8;
            wisdom = 2;
            break;

            case 2: this.profession = "Merchant";
            strength = 5;
            wisdom = 5;
            break;

            case 3: this.profession = "Assassin";
            strength = 4;
            wisdom = 6;
            break;

            case 4: this.profession = "Magician";
            strength = 7;
            wisdom = 4;
            break;
        }


        System.out.println("\n Now we have completed your character: " +
        "\n" +
        "\n Name: " + this.name +
        "\n     Race: " + this.race +
        "\n             Inteligence: " + this.inteligence +
        "\n             Profession: " + this.profession +
        "\n             Strength: " + this.strength +
        "\n             Wisdom: " + this.wisdom +

        "\n _______________________________________________________________"
        
        );



     }

     public void modifiers(int modifier){

        switch(modifier){  

            case 1: // +3 strength and - 2 inteligence
            strength = this.strength + 3;
            inteligence = this.inteligence - 2;
            break;

            case 2: // +2 wisdom and - 1 inteligence
            wisdom = this.wisdom + 2;
            inteligence = this.inteligence - 1;
            break;

            case 3: // +3 wisdom and - 2 strength
            wisdom = this.wisdom + 3;
            strength = this.strength - 2;
            break;

            case 4: // +2 wisdom and + 1 inteligence but - 4 Strength
            strength = this.strength - 4;
            inteligence = this.inteligence + 1;
            wisdom = this.wisdom + 2;
            break;

            case 5: 
            break;
        }

        System.out.println("\n Ok, those are your character features: " +
        "\n" +
        "\n Name: " + this.name +
        "\n     Race: " + this.race +
        "\n             Inteligence: " + this.inteligence +
        "\n             Profession: " + this.profession +
        "\n             Strength: " + this.strength +
        "\n             Wisdom: " + this.wisdom +

        "\n _______________________________________________________________"

        );

        System.out.println("\n Let the game begin!");
        System.out.println("\n END");
     }


    }
    

