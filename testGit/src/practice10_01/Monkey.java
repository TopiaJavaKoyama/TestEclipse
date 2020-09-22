package practice10_01;

public class Monkey extends Animal {

	// フィールド変数：追加なし

	// コンストラクタ
	public Monkey(String name, String specialSkill) {
		super(name, specialSkill);
	}

	public Monkey() {
		super();
	}

	// 鳴く
	@Override
	public void cry() {
		System.out.println("ウッキー！");
	}

	// 特技を実行する
	@Override
	public void play() {
		System.out.println(getName()+"はひっかいた。");
	}

}
