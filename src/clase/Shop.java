package clase;

public abstract class Shop {
	public void add(Shop shop){
		throw new UnsupportedOperationException();
	}
	public void remove(Shop shop){
		throw new UnsupportedOperationException();
	}
	public Shop getChild(int i){
		throw new UnsupportedOperationException();
	}
	public abstract void descriere();
}
