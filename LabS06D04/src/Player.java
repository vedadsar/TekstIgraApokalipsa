
public class Player extends Character{
	private double intell;
	
	Player(String name, double hp, double dex, Weapon wpn,
			double strenght, double speed, double intell){
		
		super(name, hp, dex, wpn, strenght, speed);
		this.intell = intell;
	}
	
	
	
	public double getIntell() {
		return intell;
	}

	public void setIntell(double intell) {
		if(intell <0.5 || intell < 2)
			throw new IllegalArgumentException("Itenlligence mora biti izmedju 0.5 i 2");
		this.intell = intell;
	}

    @Override
	public double attack(){
    	return super.attack()*intell;
		
	}
    
    @Override
    public double specialAttack(){
		return super.specialAttack();
	}
	
	
/**
 * Sansa za bijeg, vraca true ako ce pobjeci, u protivnom false
 *  * @param zombie
 * @return
 */
	public boolean escChance(Character zombie){
		if((intell*getSpeed())/zombie.getSpeed() >=1 )
			return true;
		return false;
		
		
	}
	
	public String toString(){
		String out = "Name: " +getName() +"\nHP: " +getHp() +"\nDex: " +getDex()   + "\nStrenght: " +getStrenght() + "\nSpeed: " +getSpeed()+ "\nWeapon: " + getWpn().toString() +"Intelligence: " +intell;
	    return out;
	}

}
