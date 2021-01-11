package designPattern.builder;

class EarthQuakeResistantBuilder implements Builder{
	
	private Home earthQuakeResistantHome = new Home();
	
	@Override
	public void buildFloor() {
		this.earthQuakeResistantHome.floor = "Wooden floor";
	}
	
	@Override
	public void buildWalls() {
		this.earthQuakeResistantHome.walls = "Wooden Walls";
	}
	
	@Override
	public void buildTerrace() {
		this.earthQuakeResistantHome.terrace = "Wooden terrace";
	}
	
	public Home getComplexHomeObject() {
		return this.earthQuakeResistantHome;
	}

}