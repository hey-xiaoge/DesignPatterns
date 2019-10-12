package priv.xf.design.facade;

/**
 * 屏幕
 * 单例模式 —— 饿汉式
 */
public class Screen {

	private static Screen instance = new Screen();

	private Screen() {
	}

	public static Screen getInstance() {
		return instance;
	}
	

	//上升
	public void up() {
		System.out.println(" Screen up ");
	}

	//下降
	public void down() {
		System.out.println(" Screen down ");
	}
	

}
