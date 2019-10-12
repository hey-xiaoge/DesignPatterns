package priv.xf.design.facade;

/**
 * 爆米花
 * 单例模式 —— 饿汉式
 */
public class Popcorn {

	//私有化静态变量
	private static Popcorn instance = new Popcorn();

	//构造器私有化
	private Popcorn() {

	}

	/**
	 *  对外提供获取单利的方法
	 */
	public static Popcorn getInstanc() {
		return instance;
	}

	//开机
	public void on() {
		System.out.println(" dvd on ");
	}
	//关机
	public void off() {
		System.out.println(" dvd off ");
	}

	//播放
	public void play() {
		System.out.println(" dvd is playing ");
	}

	public void pop() {
		System.out.println(" popcorn is poping  ");
	}

}
