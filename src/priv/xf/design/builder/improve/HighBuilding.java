package priv.xf.design.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		house.setBasic("10米深地基");
		System.out.println(" 高房子打地基 10米 ");
	}

	@Override
	public void buildWall() {
		house.setWall("墙壁厚度20cm");
		// TODO Auto-generated method stub
		System.out.println(" 高房子砌墙 20cm");
	}

	@Override
	public void buildRoofed() {
		house.setWall("中式屋顶");
		// TODO Auto-generated method stub
		System.out.println(" 高房子封顶 ");
	}

}
