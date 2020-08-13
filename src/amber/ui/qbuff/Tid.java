package amber.ui.qbuff;

import haven.ItemInfo;

final class Tid implements ItemInfo.Layout.ID<Table> {
	Tid() {
	}

	public Table make() {
		return new Table();
	}
}
