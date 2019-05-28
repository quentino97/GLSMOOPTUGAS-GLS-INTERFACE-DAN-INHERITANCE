
public class Char6 extends BaseCharacter implements IChef,IDriver{

	public Char6() {
		// TODO Auto-generated constructor stub
		name = "Char6";
		desc = "Koki Drive thru";
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

}
