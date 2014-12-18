public class Jockey extends Zombi {
	public Jockey() {
		super("Jockey", 78, 0.4, 4, 5);
	}
	@Override
	public double attack(){
		return super.attack();
	}
	@Override
	public double specialAttack() {
		int chance =(int) (Math.random()*6);
		if(chance == 0)
			return 0;
		else
		return  ( (1+Math.random()) * super.attack());
	}

}