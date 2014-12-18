
public class Weapon {
private double damage;
private double crit;
private double ammo;

public Weapon(){
	damage =0;
	crit=0;
	ammo=0;
}

public Weapon(double damage, double crit, double ammo){
	this.damage=damage;
	this.crit=crit;
	this.ammo=ammo;
}

public Weapon(Weapon other){
	this.damage=other.damage;
	this.crit=other.crit;
	this.ammo=other.ammo;
}

public String toString(){
	String weaponToString="\n\tSteta: "+damage+"\n\tCritical:"+crit+"\n\tMunicija: "+ammo;
	return weaponToString;
}

public double getDamage() {
	return damage;
}

public void setDamage(double damage) {
	this.damage = damage;
}

public double getCrit() {
	return crit;
}

public void setCrit(double crit) {
	this.crit = crit;
}

public double getAmmo() {
	return ammo;
}

public void setAmmo(double ammo) {
	this.ammo = ammo;
}



}
