package designPattern.builder;

interface Builder {
	
	public void buildFloor();
	public void buildWalls();
	public void buildTerrace();
	
	public Home getComplexHomeObject();

}