package classesMethodsConcepts;

public class VolumeOfCube 
{
	 public int cube()
	    {
	        int a = 9;
	        int volume = a*a*a;
	        System.out.println("Volume of the cube is"+volume);
	        return volume;
	    }
	    public static void main(String[] args) {
	    	VolumeOfCube vol = new VolumeOfCube();
	        vol.cube();
	    }

}
