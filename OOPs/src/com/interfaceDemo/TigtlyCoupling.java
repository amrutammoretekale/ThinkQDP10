package com.interfaceDemo;

interface Massages {

	void sendMassages(String m);
}

class Whatsapp implements Massages {
	String type;

	public Whatsapp() {

	}

	@Override
	public void sendMassages(String m) {
		this.type = "Whatsapp";
		System.out.println(type + ":" + m);

	}
}

class Telegaram implements Massages {
	String type;

	public Telegaram() {

	}

	@Override
	public void sendMassages(String m) {
		// TODO Auto-generated method stub
		this.type = "Telegram";
		System.out.println(type + ":" + m);
	}

}

public class TigtlyCoupling {
	public void msgNotify(Whatsapp w, String m) {
		w.sendMassages(m);
	}

	// Loose Coupling
	public void msgNotify(Massages ser, String m) {
		ser.sendMassages(m);
	}

	public static void main(String[] args) {
		TigtlyCoupling obj = new TigtlyCoupling();
		Whatsapp w1 = new Whatsapp();
		obj.msgNotify(w1, "Welcome");

		Telegaram t1 = new Telegaram();
		obj.msgNotify(t1, "hello");

		Massages s;
		s = new Telegaram();
		obj.msgNotify(s, "Welcome");
		s = new Telegaram();
		obj.msgNotify(s, "Hello");
	}
}