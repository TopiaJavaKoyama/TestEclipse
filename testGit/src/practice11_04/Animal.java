package practice11_04;

public class Animal {
	// フィールド変数
	private String name;			// 名前
	private String specialSkill;	// 特技

	// コンストラクタ
	public Animal(String name, String specialSkill) {
		this.name = name;
		this.specialSkill = specialSkill;
	}

	public Animal() {
		this("無し","無し");
	}

	// 鳴く
	public void cry() {
		System.out.println("鳴き声は無し");
	}

	// 特技を実行する
	public void play() {
		System.out.println("特技は無し");
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialSkill() {
		return specialSkill;
	}

	public void setSpecialSkill(String specialSkill) {
		this.specialSkill = specialSkill;
	}

}
