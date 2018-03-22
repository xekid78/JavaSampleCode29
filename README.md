# JavaStaticVariable
static変数

## 処理
[JavaArgumentAndReturnValue](https://github.com/xekid78/JavaArgumentAndReturnValue)にstatic変数で消費税込みの価格を計算たものです。

## コード
```
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
```

## 出力結果  
```
リンゴの合計金額は1944円です。
オレンジの合計金額は2937円です。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
