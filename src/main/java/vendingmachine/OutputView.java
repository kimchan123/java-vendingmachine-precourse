package vendingmachine;

import java.util.Map;

public class OutputView {
	private static final String PRINT_VENDING_MACHINE_COIN = "자판기가 보유한 동전";

	public void printVendingMachineCoin(Map<Coin, Integer> vendingMachineCoin) {
		System.out.println();
		System.out.println(PRINT_VENDING_MACHINE_COIN);
		vendingMachineCoin.keySet().stream().forEach(coin -> {
			printCoin(coin.getAmount(), vendingMachineCoin.get(coin));
		});
	}

	public void printCoin(int amount, int count) {
		System.out.println(amount + "원 - " + count + "개");
	}
}
