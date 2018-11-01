import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super(0);
  }

  public NoNullArrayList(int cap) {
    super(cap);
  }

  public void add(T thing) {
    if(thing != null) {
      super.add(thing);
    }

  }

  public void add(int index, T thing) {
    if(thing != null) {
      super.add(index,thing);
    }

  }


}
