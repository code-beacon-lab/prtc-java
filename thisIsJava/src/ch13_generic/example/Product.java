package thisIsJava.ch13_generic.example;

public class Product<T, M> {
	private T kind;
	private M model;

	public T getkind() {
		return this.kind;
	}
	
	public M getmodel() {
		return this.model;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}
}
