
public class Char5 extends BaseCharacter implements IWorker, IDriver{

	public Char5() {
		name = "Char5";
		desc = "Pengemudi Kerja";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name + " Menyetir");
		
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name + " Bekerja");
	}

}
