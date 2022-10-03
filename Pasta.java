package FastFood_startup;

public class Pasta {
	private String flavours;
	private String types;

	public String getFlavours() {
		return flavours;
	}

	public void setFlavours(String flavours) {
		this.flavours = flavours;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}
	
	public String havePasta()
	{
		return this.flavours+" pasta "+this.types+" type";
	}
}
