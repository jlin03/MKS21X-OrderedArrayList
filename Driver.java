public class Driver {
  public static void main(String[] args){
    NoNullArrayList<String> a = new NoNullArrayList<String>();
    a.add("x");
	a.add("s");
	a.add(1, "a");
    System.out.println(a.get(0) + a.get(1) + a.get(2));
	//"xas"
	
	OrderedArrayList<String> b = new OrderedArrayList<String>();
	b.add("b");
	b.add("a");
	b.add(0,"c");
	System.out.println(b.get(0) + b.get(1) + b.get(2));
	//"abc"
	b.set(0,"d");
	System.out.println(b.get(0) + b.get(1) + b.get(2));
	//"bcd"
	
  }






}
