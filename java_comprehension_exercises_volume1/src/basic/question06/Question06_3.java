package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装
		int amount = 0;
		int price = 100;

		System.out.println("購入の値段を意味する。");
		System.out.println("はい：0、いいえ：1>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		int buyFlag = Integer.parseInt(input);

		while (buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の本数を1つ増やしますか？");
			System.out.println("はい：0、いいえ：1>");

			input = reader.readLine();
			buyFlag = Integer.parseInt(input);

		}
		System.out.println("購入した鉛筆の本数は" + amount + "本です。");

		System.out.println("購入した鉛筆の合計は" + (amount * price) + "円です。");

	}

}
