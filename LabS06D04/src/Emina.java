public class Emina extends Zombi {
	public Emina() {
		super("Emina", 190, 0.87,  9, 18);
	}
	@Override
	
		public double attack(){
			return super.attack();
	}
	@Override
	public double specialAttack() {
		int chance =(int) (Math.random()*3);
		if(chance == 0)
			return 0;
		else
		return  ( (1+Math.random()) * super.attack());
	}

}
