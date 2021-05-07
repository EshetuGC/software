public class ABC {

	private String name=null;
	private int id;

	public String display(String name, int id) {
		this.id=id;
		this.name=name;
		
		return this.name+this.id;
		
	}

	public String show(String name) {
		this.name=name;
	
		return this.name;

	}
}
