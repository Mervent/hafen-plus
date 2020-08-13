package amber.ui;

import haven.ItemInfo.Tip;
import haven.Text;

import java.awt.image.BufferedImage;

public class Wear extends Tip {
	public final int d;
	public final int m;

	public Wear(Owner var1, int d, int m) {
		super(var1);
		this.d = d;
		this.m = m;
	}

	public BufferedImage tipimg() {
		return Text.render(String.format("Armor class: %,d/%,d", Integer.valueOf(this.d), Integer.valueOf(this.m))).img;
	}
}
