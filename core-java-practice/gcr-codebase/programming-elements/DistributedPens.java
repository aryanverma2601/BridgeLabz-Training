public class DistributedPens {
    public static void main(String[] args) {
        int pens = 14;

        int DistributedPens  = pens / 3;
        int RemainingPens = pens % 3;

        System.out.println("The Pen per student is " + DistributedPens + " annd the Remaining Pens non distrubuted is " + RemainingPens);
    }
}
