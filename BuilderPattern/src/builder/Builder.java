package builder;

public interface Builder<K,T> {
	public K price (double price);
	public K engineDescription (String engineDescription);
	public K yearOfManufacture (int yearOfManufacture);
	public K automaker (String automaker);
	public T create();
}