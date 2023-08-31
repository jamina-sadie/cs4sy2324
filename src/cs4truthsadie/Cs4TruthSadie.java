
package cs4truthsadie;

public class Cs4TruthSadie {

    public static void main(String[] args) {
    String sport1 = "frisbee";
    int player1 = 7;
    String level1 = "non-contact";
    int date1 = 1968;
    String sport2 = "volleyball";
    int player2 = 6;
    String level2 = "non-contact";
    int date2 = 1895;
    String sport3 = "soccer";
    int player3 = 11;
    String level3 = "contact";
    int date3 = 1863;
    int playerdiff = player3 - player2;
    int yeardiff = date1 - date3;

    System.out.println(sport1 +"\ndate invented: " + date1 + "\nno. of players: " + player1 + "\nsport classification based on level: " + level1 + "\n");
    System.out.println(sport2 +"\ndate invented: " + date2 + "\nno. of players: " + player2 + "\nsport classification based on level: " + level2 + "\n");
    System.out.println(sport3 +"\ndate invented: " + date3 + "\nno. of players: " + player3 + "\nsport classification based on level: " + level3 + "\n");
  
    System.out.println("The difference of the no. of players in volleyball and soccer is " + playerdiff);  
    
    if (level1 == level2) {
      System.out.println("Both frisbee and volleyball are non-contact sports: true");
    }
    else {
      System.out.println("Both frisbee and volleyball are non-contact sports: false");
    }

    if (date3 < date1){
      System.out.println("Soccer was invented " + yeardiff + " years before frisbee");
    }
    else {
      System.out.println("Soccer was invented before frisbee: false");
    }
  }
}
