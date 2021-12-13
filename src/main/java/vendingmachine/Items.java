package vendingmachine;

import java.util.List;

public class Items {
	private final List<Item> items;

	public Items(List<Item> items) {
		this.items = items;
	}

	public boolean isAmountAllZeroInItems() {
		return items.stream().allMatch(item -> item.isAmountZero());
	}

	public boolean isBuyable(int insertAmount) {
		return items.stream()
			.filter(item -> !item.isAmountZero())
			.filter(item -> item.isBuyable(insertAmount))
			.count() > 0;
	}
}
