public class OrderedArrayList<E extends Comparable<E>> extends NoNullArrayList<E> {
	public OrderedArrayList() {
		super(0);
	}

	public OrderedArrayList(int cap) {
		super(cap);
	}

	public boolean add(E thing) {
		int initsize = this.size();
		if(this.size() == 0) {
			super.add(thing);
			return true;
		}
		else {
			for(int i = 0; i < this.size(); i++) {
				if(thing.compareTo(this.get(i)) <= 0) {
					super.add(i, thing);
					break;
				}
			}
			if(initsize == this.size()) {
				super.add(thing);
			}
			return true;
		}
	}

	public void add(int index, E thing) {
		this.add(thing);
	}

	public E set(int index, E thing) {
		remove(index);
		this.add(thing);
		return thing;
	}


}
