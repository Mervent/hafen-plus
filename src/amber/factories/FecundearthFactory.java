package amber.factories;

import haven.ItemInfo;

public class FecundearthFactory implements ItemInfo.InfoFactory {
	public FecundearthFactory() {
	}

	public ItemInfo build(ItemInfo.Owner var1, Object... var2) {
		double var3 = ((Number) var2[1]).doubleValue();
		String str = "Growth speed of wheat, flax, wine and pumpkins: +%d%%";
		return new ItemInfo.AdHoc(var1, String.format(str, Math.round(var3 * 100.0D)));
	}
}
