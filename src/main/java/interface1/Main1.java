package interface1;
//���ǲ���ֱ��ȥʵ����һ���ӿڣ���Ϊ�ӿ��еķ������ǳ���ģ���û�з�����ģ�������ô���ܲ��������ʵ���أ����ǣ����ǿ���ʹ�ýӿ����͵�����ָ��һ��ʵ���˸ýӿڵĶ��󣬲��ҿ��Ե�������ӿ��еķ�����
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
