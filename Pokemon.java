import java.util.*; //scanner, ArrayList, Map
import java.io.*; //file, filenotfoundexception

public class Pokemon{
  private String name, type1, type2;
  private int attack, speed, defense, hp;
  private ArrayList<String> attacks, typeWeakness, typeResistance;

  public Pokemon(String name1){
    name = name1;
    for (int x = 0; data[x] < != name; x++){
      if (data[x] == name){
        type1 = data[2];
        type2 = data[3];
        hp = data[5];
        attack = data[6].parseInt();
        defense = data[7].parseInt();
        speed = data[11].parseInt();
      }
    }
  }
  //Accessor Methods
  public String getType1(){
    return type1;
  }

  public String getType2(){
    return type2;
  }

  public int getHP(){
    return hp;
  }

  public int getAttack(){
    return attack;
  }

  public int getDefense(){
    return defense;
  }

  public ArrayList<String> getAttacks(){
    return attacks;
  }

  public ArrayList<String> getTypeWeakness(){
    return typeWeakness;
  }

  public ArrayList<String> getTypeWeakness(){
    return typeWeakness;
  }
}
