
public class TestLakeData {
	public static void main (String[] args) {
		CSC2310_Lake_System lakeSystem = new CSC2310_Lake_System();
		lakeSystem.printLakes_depthGreaterThan(100);
		lakeSystem.printVolumeForAllLakes();
		lakeSystem.printVolumeAndDepthforLake("Lake Lanier");
		lakeSystem.printLakewithLargestVolume();
	}
}
