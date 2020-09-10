// ------------------ Mad Libs ----------------
/*In this project, we’ll use Java to write a Mad Libs word game! Mad Libs have short stories with blank spaces that a player can fill in. The result is usually funny (or strange).

Mad Libs require:
- A short story with blank spaces (asking for different types of words).
- Words from the player to fill in those blanks.*/

public class MadLibs {
  /*
    This program generates a mad libbed story.
    Author: B. Juhász Péter
    Date: 09/10/2020
  */
  	public static void main(String[] args){
      
      String name1 = "Gyula";
      String adjective1 = "good";
      String adjective2 = "bad";
      String adjective3 = "claver";
      String verb1 = "read";
      String noun1 = "book";
      String noun2 = "refigirator";
      String noun3 = "lamp";
      String noun4 = "blackboard";
      String noun5 = "door";
      String noun6 = "pencil";
      String name2 = "Lajos";
      int number = 10;
      String place1 = "kichen";


      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 
      'It is going to be a "+adjective2+" day!' 
      Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. 
      They began to "+verb1+" to the rhythm of the "+noun3+", 
      which made all the "+noun4+"s very "+adjective3+". 
      Concerned, "+name1+" texted "+name2+", 
      who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". 
      "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
