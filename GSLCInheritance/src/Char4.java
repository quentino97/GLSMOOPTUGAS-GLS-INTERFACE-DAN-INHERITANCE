
public class Char4 extends BaseCharacter implements IChef,IWorker,IArtist{

	public Char4() {
		name = "Char4";
		desc = "Koki profesional";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(name + " Melukis");
		
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name + " Bekerja");
		
	}

	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name + " Memasak");
		
	}

}
