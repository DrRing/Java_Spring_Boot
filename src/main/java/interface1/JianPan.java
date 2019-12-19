package interface1;

public class JianPan implements  InterfaceUSB {
	//@Override
	public void read(){
		System.out.println("键盘正在通过USB功能读取数据");
	}
//@Override
	public void write() {
		System.out.println("键盘正在通过USB功能写入数据");

	}

	

}
