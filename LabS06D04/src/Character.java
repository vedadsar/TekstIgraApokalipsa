public class Character {
	private String name;
	private double hp;
	private double dex;
	private Weapon wpn;
	private double strenght;
	private double speed;

	public Character(String name, double hp, double dex, Weapon wpn,
			double strenght, double speed) {

		this.name = name;
		this.hp = hp;
		setDex(dex);
		this.wpn = new Weapon(wpn);
		setStrenght(strenght);
		setSpeed(speed);
	}

	public Character(String name, double hp, double dex, 
			double strenght, double speed) {

		this.name = name;
		this.hp = hp;
		setDex(dex);
		this.wpn = new Weapon();
		setStrenght(strenght);
		setSpeed(speed);
	}
	/**
	 * equals metoda.
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(Character other) {
		if (this.name.equals(other.name) && this.hp == other.hp
				&& this.dex == other.dex && this.wpn.equals(other.wpn)
				&& this.strenght == other.strenght && this.speed == other.speed)
			return true;
		return false;
	}

	public String toString(){
		String out = "Name: " +name +"\nHP: " +hp +"\nDex: " +dex   + "\nStrenght: " +this.strenght + "\nSpeed: " + speed+ "\nWeapon: " + wpn.toString();
		return out;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		if(hp>200)
			throw new IllegalArgumentException("HP nije validan");
		this.hp = hp;
	}

	public double getDex() {
		return dex;
	}

	public void setDex(double dex) {
		if (dex<0 || dex>1)
			throw new IllegalArgumentException("dex mora biti izmedju 0 i 1");
		this.dex = dex;
	}

	public Weapon getWpn() {
		return wpn;
	}

	public void setWpn(Weapon wpn) {
		this.wpn = wpn;
	}

	public double getStrenght() {
		return strenght;
	}

	public void setStrenght(double strenght) {
		if (strenght<0 || strenght>10)
			throw new IllegalArgumentException("strenght mora biti izmedju 0 i 10");
		this.strenght = strenght;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		if(speed<0 || speed >20)
			throw new IllegalArgumentException("Speed mora biti izmedju 0 i 20");
		this.speed = speed;
	}
	public double attack(){
		if(dex<0.5)
			return dex*Math.random()*strenght;
		return dex*(strenght);
		
	}
	public double specialAttack(){
		return 0;
	}
	
	
}
