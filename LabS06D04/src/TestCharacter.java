import java.util.Scanner;

public class TestCharacter {

	public static boolean bjezanje(Player p, Zombi z) {
		if (p.escChance(z) == true)
			return true;
		else
			return false;
	}

	public static Zombi kreirajZombija() {
		Zombi prvi = null;
		int random = (int) ((5 * Math.random()) + 1);

		if (random == 1)
			prvi = new Charger();

		if (random == 2)
			prvi = new Spitter();

		if (random == 3)
			prvi = new Smoker();

		if (random == 4)
			prvi = new Jockey();

		if (random == 5)
			prvi = new Emina();

		return prvi;
	}

	public static boolean zombiJeMrtav(Player p, Zombi z) {

		while (p.getHp() > 0 && z.getHp() > 0) {
			if (p.attack() > z.attack())
				z.setHp(z.getHp() - 1);
			else {
				p.setHp(p.getHp() - 1);
			}
		}

		if (p.getHp() <= 0)
			return false;
		else
			return true;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Weapon noWpn = new Weapon(0, 0, 0);

		Player igrac = new Player("Vedad", 100, 0.4, noWpn, 4, 16, 1.7);
		Zombi prvi = kreirajZombija();

		System.out
				.println("Poslani ste u Cernobil da istrazite neobicne pojave koje su prijavljene:");

		int deadZombieCounter = 0;

		while (deadZombieCounter < 5) {

			System.out.println("Iznenada ispred vas iskace zombi "
					+ prvi.getName());
			System.out
					.println("Sta raditi, pobjeci (pritisni 1) ili ostati (pritisni 0)");
			int decision = in.nextInt();

			if (decision == 1) {
				boolean jePobjegao = bjezanje(igrac, prvi);
				if (jePobjegao == true)
					System.out.println("Pobjegli ste!!");
				else {
					System.out.println("Morate se boriti");
					decision = 0;
				}

			}
			if (decision != 1) {
				boolean borba = zombiJeMrtav(igrac, prvi);
				if (borba == true) {
					System.out
							.println("Cestitamo ubili ste zombija, idemo dalje !!!");
					System.out.println(igrac.getHp());
				
					prvi = kreirajZombija();
					deadZombieCounter++;
				} else{
					System.out.println("Ubio vas je zombi");
				return;
				}
			}

		}
		
		if(deadZombieCounter == 5)
			System.out.println("Cestitamo, uspjeli ste ubiti 5 zombija. Prekucali ste igricu");
	}

}
