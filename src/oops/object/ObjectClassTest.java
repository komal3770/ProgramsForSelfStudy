package oops.object;

/*
* Implemented hashcode, equals. So check what happens when we compare 2 different objects  using ==
* Concept: Contract between equals & hashcode
* */
public class ObjectClassTest {
	private int x;
	private String y;
	private boolean z;


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public boolean isZ() {
		return z;
	}
	public void setZ(boolean z) {
		this.z = z;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		result = prime * result + (z ? 1231 : 1237);
		System.out.println(STR."Hashcode result \{result}");
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClassTest other = (ObjectClassTest) obj;
		if (x != other.x)
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		if (z != other.z)
			return false;
		return true;
	}



	@Override
	protected ObjectClassTest clone() throws CloneNotSupportedException {
		ObjectClassTest obj = this;
		return obj;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called.");
		super.finalize();
	}
	public static void main(String[] args) {
		ObjectClassTest test1 = new ObjectClassTest();
		ObjectClassTest test2 = new ObjectClassTest();
		System.out.println(test1.hashCode() == test2.hashCode());
		System.out.println(test1.equals(test2));
	}

}
