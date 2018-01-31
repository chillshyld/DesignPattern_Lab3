package Factory;

public class NJSlotProgressive extends Slot {
	public NJSlotProgressive() {
		name="Progressive";
		components.add("Small");
		components.add("bills");
		components.add("CRT");
		components.add("X86");
                software = "Windows XP";
	}
	
	void ship() {
		System.out.println("having uncle Monica drop it off");
	}
}
