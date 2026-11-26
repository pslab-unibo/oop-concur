package oop.concur.chrono_not_working;

public class ChronoCount {

	private int cont;
	private int base;

	public ChronoCount(int base) {
		this.cont = base;
		this.base = base;
	}

	public void inc() {
		cont++;
	}

	public void reset() {
		cont = base;
	}

	public int getValue() {
		return cont;
	}
}
