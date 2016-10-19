package car_factory;

public class Main_interfacce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factories honda = Factory_Interface.getcar("honda");
		Car civic = honda.createcar("Civic");
		civic.drive();
		
		Car accord = honda.createcar("accord");
		accord.drive();
		
		Factories hyundai = Factory_Interface.getcar("hyundai");
		Car sonata = hyundai.createcar("sonata");
		sonata.drive();
		
		Car elantra = hyundai.createcar("elantra");
		elantra.drive();

	}

}
