package haven.res.ui.tt.q.qbuff;

import haven.*;

import java.awt.*;
import java.awt.image.BufferedImage;

public class QBuff extends ItemInfo.Tip {
	public final BufferedImage icon;
	public final String name;
	public final String origName;
	public final double q;
	public static final Layout.ID<Table> lid = new Tid();
	public static final Layout.ID<Summary> sid = new Sid();
	public Tex qtex, qwtex;

	public QBuff(Owner owner, BufferedImage icon, String name, double q) {
		super(owner);
		this.icon = icon;
		this.origName = name;
		this.name = name;
		this.q = q;
		if (q != 0) {
			qtex = Text.rendersmall(Math.round(q) + "").tex();
			qwtex = Text.rendersmall(Math.round(q) + "").tex();
		}
	}

	public void prepare(Layout layout) {
		layout.intern(lid).ql.add(this);
	}

	public Tip shortvar() {
		return new ShortTip(this, this.owner);
	}
}
