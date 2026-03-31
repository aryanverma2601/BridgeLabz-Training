public class VolumeEarth {
    public static void main(String[] args) {
        double radius = 6378; 
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume of the Earth in cubic kilometers is" + volume + "and cubic miles is ", volume * 0.239 );
    }
}
