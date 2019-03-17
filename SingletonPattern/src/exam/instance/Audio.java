package exam.instance;

public class Audio {

	private static Audio instance;
	private int valume = 0;
	
	private Audio() {}
	
	public static Audio getInstance() {
		
		if(instance == null) {
			instance = new Audio();
		}
		
		return instance;
	}
	
	public void use() {
		System.out.println(this.valume + "Valume으로 출력합니다.");
	}

	public void setValume(int valume) {
		this.valume = valume;
	}
	
	
}
