/**
 *
 * @author xekid78
 *
 */
public class Static {

	public static void main(String[] args) {
		Item2 apple = new Item2(120, 15);
		System.out.println("リンゴの合計金額は" + apple.gokei() + "円です。");
		Item2 orenge = new Item2(85, 32);
		System.out.println("オレンジの合計金額は" + orenge.gokei() + "円です。");

	}

}

class Item2 {
	private int tanka;
	private int kosu;
	private static double tax = 1.08;

	public Item2(int tankax, int kosuy) {
		tanka = tankax;
		kosu = kosuy;
	}

	public int gokei() {
		return (int)(tanka * kosu * tax);
	}

}
