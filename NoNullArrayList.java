import java.util.ArrayList;

public class NoNullArrayList<E> extends ArrayList<E> {
  public NoNullArrayList() {
    super(0);
  }

  public NoNullArrayList(int cap) {
    super(cap);
  }

  public boolean add(E thing) {
    if(thing != null) {
      super.add(thing);
	  return true;
    }
	return false;

  }

  public void add(int index, E thing) {
    if(thing != null) {
      super.add(index,thing);
    }

  }


}
