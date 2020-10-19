package jump2java;

public class ZooKeeper{
	
	public void feed(Predator predator){
		System.out.println("feed "+predator.getFood());
	}
	
	public static void main(String[] args) {
		ZooKeeper zookeeper=new ZooKeeper();
		Tiger tiger=new Tiger();
		Lion lion=new Lion();
//		tiger.setName("호랑이");
		zookeeper.feed(tiger);
//		lion.setName("사자");
		zookeeper.feed(lion);
		
	}
}
