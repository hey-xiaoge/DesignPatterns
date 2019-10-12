package priv.xf.design.facade;

/**
 * 立体声
 * 单例模式 —— 饿汉式
 */
public class Stereo {

	private static Stereo instance = new Stereo();

	private Stereo() {
	}

	public static Stereo getInstance() {
		return instance;
	}

	//开机
	public void on() {
		System.out.println(" Stereo on ");
	}

	//关机
	public void off() {
		System.out.println(" Screen off ");
	}

	//增大声音
	public void up() {
		System.out.println(" Screen up.. ");
	}

	//减小声音
	public void down() {
		System.out.println(" Screen down.. ");
	}

	//...
}
