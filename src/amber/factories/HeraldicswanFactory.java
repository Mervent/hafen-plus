package amber.factories;

import haven.ItemInfo;

public class HeraldicswanFactory implements ItemInfo.InfoFactory {
	public HeraldicswanFactory() {
	}

	public ItemInfo build(ItemInfo.Owner var1, Object... var2) {
		double var3 = ((Number) var2[1]).doubleValue();
		String str = "Quality of swans: +%d%%";
		return new ItemInfo.AdHoc(var1, String.format(str, Math.round(var3 * 100.0D)));
	}
}
