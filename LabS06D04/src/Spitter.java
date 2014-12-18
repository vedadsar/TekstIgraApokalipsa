public class Spitter extends Zombi {
	public Spitter() {
		super("Spitter", 115, 0.55,  6.85, 10);
	}
	@Override
	public double attack(){
		return super.attack();
	}
	@Override
	public double specialAttack() {
		int chance =(int) (Math.random()*5);
		if(chance == 0)
			return 0;
		else
		return  ( (1+Math.random()) * super.attack());
	}
}
