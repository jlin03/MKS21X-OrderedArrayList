public class OrderedArrayList<E extends Comparable<E>> extends NoNullArrayList<E> {
	public OrderedArrayList() {
		super(0);
	}
	
	public OrderedArrayList(int cap) {
		super(cap);
	}
	
	public boolean add(E thing) {
		if(this.size() == 0) {
			super.add(0, thing);
			return true;
		}
		else {
			for(int i = 0; i < this.size(); i++) {
				if(thing.compareTo(this.get(i)) <= 0) {
					super.add(i, thing);
					break;
				}
				if(i == this.size() - 1) {
					super.add(thing);
				}
			}
			return true;
		}
	}
	
	public void add(int index, E thing) {
		add(thing);
	}
	
	public E set(int index, E thing) {
		remove(index);
		remove(this.size() - 1);
		add(thing);
		return thing;
	}
	
	
}