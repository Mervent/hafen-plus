package haven.factories;

import haven.ItemInfo;
import haven.RichText;
import haven.Text;

import java.awt.image.BufferedImage;

public class WoodlandrealmFactory implements ItemInfo.InfoFactory {
	public WoodlandrealmFactory() {
	}

	public ItemInfo build(ItemInfo.Owner var1, Object... var2) {
		double var3 = ((Number) var2[1]).doubleValue();
		double var5 = ((Number) var2[2]).doubleValue();
		return new Tip(var1, var3, var5);
	}

	public class Tip extends ItemInfo.Tip {
		Text tip;

		public Tip(Owner var2, double var3, double var5) {
			super(var2);
			String str = "Growth speed of trees: +%d%%\nQuality of items foraged on woodlands: +%d%%\nQuality of woodland animals: +%.1f%%";
			this.tip = RichText.render(
					String.format(str, Math.round(var3 * 100.0D), Math.round(var5 * 100.0D), Double.valueOf(var5 * 50.0D)), 0);
		}

		public BufferedImage tipimg() {
			return this.tip.img;
		}
	}
}
