

public class Player {
   private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = checkHealthPercentage(healthPercentage);
        this.weapon = weapon;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name ;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }
public int checkHealthPercentage(int health){
        if(health>100){
            return 100;
        }
        else if (health<0){
            return 0;
        }
        else{
            return health;
        }

}
    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage=checkHealthPercentage(healthPercentage) ;
    }
public int healthRemaining(){
        return healthPercentage;
}
    public int loseHealth(int damage){
        if(healthPercentage>0){
            if(damage>=healthPercentage){
                System.out.println(name + " player has been knocked out of game");
                return 0;
            }
            healthPercentage -= damage;
            return healthPercentage;

        }
              return 0;
    }

    public int restoreHealth(int healthPotion){
        if(healthPercentage<100){
            healthPercentage += healthPotion;
            if(healthPercentage>100){
                return this.healthPercentage=100;
            }
        }
       return healthPercentage;
    }
    public String toString(){
        return "Name:" + name + "HealthPersantage: "+ healthPercentage+"Weapon: "+ (weapon);
    }
}
