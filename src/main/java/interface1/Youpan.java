package interface1;

class Youpan implements InterfaceUSB {
	//@Override
	public void read(){
		System.out.println("U盘正在通过USB功能读取数据");
	}
	public void write() {
		System.out.println("U盘正在通过USB功能写入数据");

	}

}
