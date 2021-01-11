package designPattern.builder;

class FloodResistantBuilder implements Builder{
	
	private Home floodResistantHome = new Home();
	
	@Override
	public void buildFloor() {
		floodResistantHome.floor = "10 feet above ground level";
	}
	
	@Override
	public void buildWalls() {
		floodResistantHome.walls = "Water Resistant walls";
	}
	
	@Override
	public void buildTerrace() {
		floodResistantHome.terrace = "Water leakage resistant terrace";
	}
	
	public Home getComplexHomeObject() {
		return this.floodResistantHome;
	}

}