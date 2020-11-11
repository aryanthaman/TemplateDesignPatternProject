
public class ChooseYourOwnHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" ** Welcome to your music store DB! ** ");
		System.out.println();

		//Create Concrete Objects
		Guitar ibanezSDGR = new Guitar(1, 500, 700);
		Drums pearl = new Drums(4, 800, 1000);
		Bass fenderP = new Bass(6, 650, 850);

		//Call the template Function on the object
		ibanezSDGR.updateInstrument();
		pearl.updateInstrument();
		fenderP.updateInstrument();

	}

}
