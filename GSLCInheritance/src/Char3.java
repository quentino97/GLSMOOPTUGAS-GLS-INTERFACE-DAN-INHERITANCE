
public class Char3 extends BaseCharacter implements IArtist,IChef,IDriver,IWorker{

	public Char3() {
		name = "Char3";
		desc = "Ahli 4 kerja";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name + " Bekerja");
		
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " Menyetir");
		
	}

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name + " Memasak");
		
	}

	@Override
	public void Paint() {
		System.out.println(name + " Melukis");
		
	}

}
