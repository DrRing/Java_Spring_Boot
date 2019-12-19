package interface1;
//我们不能直接去实例化一个接口，因为接口中的方法都是抽象的，是没有方法体的，这样怎么可能产生具体的实例呢？但是，我们可以使用接口类型的引用指向一个实现了该接口的对象，并且可以调用这个接口中的方法。
public class Main1 {
	public static void main(String[] args) {
	
		InterfaceUSB youpan = new Youpan();
		youpan.read();
		youpan.write();
		
		InterfaceUSB jianpan = new JianPan();
		jianpan.read();
		jianpan.write();
	}

}
