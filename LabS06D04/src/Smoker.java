public class Smoker extends Zombi {

	public Smoker() {
		super("Smoker", 150, 0.7, 8, 15);

	}
	@Override
	public double attack(){
		return super.attack();
	}
	@Override
	public double specialAttack() {
		int chance =(int) (Math.random()*4);
		if(chance == 0)
			return 0;
		else
		return  ( (1+Math.random()) * super.attack());
	}
	}