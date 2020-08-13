package amber.factories;

import haven.ItemInfo;

public class GuardedmarchesFactory implements ItemInfo.InfoFactory {
	public GuardedmarchesFactory() {
	}

	public ItemInfo build(ItemInfo.Owner var1, Object... var2) {
		double var3 = ((Number) var2[1]).doubleValue();
		String str = "Cost of realm challenges: +%d%%";
		return new ItemInfo.AdHoc(var1, String.format(str, Math.round(var3 * 100.0D)));
	}
}
