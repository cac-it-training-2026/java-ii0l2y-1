package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装
		int amountBooks = 0;
		int sellFlag = 0;
		int bookPrice = 200;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("本を売却します。");

		do {
			amountBooks++;
			System.out.println("売却する本の数を増やしますか？");
			System.out.println("はい：0、いいえ：1>");

			String input = reader.readLine();
			sellFlag = Integer.parseInt(input);

		} while (sellFlag == 0);
		System.out.println("売却した本の数:" + amountBooks + "冊です。");
		System.out.println("合計金額:" + (amountBooks * bookPrice) + "円です。");

	}

}
