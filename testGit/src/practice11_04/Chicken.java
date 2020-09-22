package practice11_04;

public class Chicken extends Animal {

	// フィールド変数
	private int eggs;

	// コンストラクタ
	public Chicken(String name, String specialSkill, int eggs) {
		super(name, specialSkill);
		this.eggs = eggs;
	}

	public Chicken() {
		super();
		this.eggs = 10;
	}

	// 鳴く
	@Override
	public void cry() {
		System.out.println("コケコッコー！");
	}

	// 特技を実行する
	@Override
	public void play() {
		System.out.println("今日、"+getName()+"は卵を"+getEggs()+"個生んだ。");
	}

	// getter/setter
	public int getEggs() {
		return eggs;
	}

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}

}
