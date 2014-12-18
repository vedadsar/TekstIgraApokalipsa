
public class Charger  extends Zombi{
	public Charger( ){
		super("Charger", 40, 0.2, 2,  3);
	}
	@Override
	public double attack(){
		return super.attack();
	}
	//specijalni napad, ako je varijabla 0 , nece udariti u suprotnom hoce sa  jacinom izracunatom u formuli
	@Override
	public double specialAttack() {
		int chance =(int) (Math.random()*7);
		if(chance == 0)
			return 0;
		else
		return  ( (1+Math.random()) * super.attack());
	}
	
}
