package test;

/**
 * 勇者クラス
 * @author tatsu
 *
 */
public class Hero {
	private String name;	// 名前
	private int hp;			// HP

	public Hero(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
