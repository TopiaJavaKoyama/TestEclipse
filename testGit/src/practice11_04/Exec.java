package practice11_04;

public class Exec {

	public static void main(String[] args) {
		Monkey monkey = new Monkey("ジョージ","ひっかき");
		System.out.println(
				monkey.getName()+"の特技は「"+monkey.getSpecialSkill()+"」です。");
		System.out.println(monkey.getName()+"は鳴いた、、、");
		monkey.cry();
		monkey.play();

		System.out.println();

		Chicken chicken = new Chicken("ガンモ","毎日卵を産む",15);
		System.out.println(
				chicken.getName()+"の特技は「"+chicken.getSpecialSkill()+"」です。");
		System.out.println(chicken.getName()+"は鳴いた、、、");
		chicken.cry();
		chicken.play();

	}

}
