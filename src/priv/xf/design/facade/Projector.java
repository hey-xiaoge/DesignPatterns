package priv.xf.design.facade;

/**
 * 投影机
 * 单例模式 —— 饿汉式
 */
public class Projector {

	private static Projector instance = new Projector();

	private Projector() {
	}

	public static Projector getInstance() {
		return instance;
	}

	//开机
	public void on() {
		System.out.println(" Projector on ");
	}

	//关机
	public void off() {
		System.out.println(" Projector ff ");
	}

	//暂停
	public void focus() {
		System.out.println(" Projector is Projector  ");
	}
	
	//...
}
