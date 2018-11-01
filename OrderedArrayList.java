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
		}
	}
	
	public boolean add(int index, E thing) {
		add(thing);
	}
	
	public void set(int index, E thing) {
		remove(index);
		add(thing);
		
	}
	
	
}