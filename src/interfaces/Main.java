/**
 * 
 */
package interfaces;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new Car();
//		car.start();
//		car.acc();
//		car.brake();
//		car.stop();
//		
//		Engine engine = new Car();
//		engine.start();
//		engine.acc();
//		engine.stop();
//		
//		Media carMedia = new CDPlayer();
//		carMedia.start();
//		carMedia.stop();
		
		NiceCar car=new NiceCar();
		car.start();
		car.startMusic();
		ElectricEngine obj=new ElectricEngine();
		car.upgradeEngine(obj);
		car.start();
		car.stop();

	}

}
