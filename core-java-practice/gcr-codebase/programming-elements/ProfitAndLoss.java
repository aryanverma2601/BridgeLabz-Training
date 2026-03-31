public class ProfitAndLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        
        double profit = sellingPrice - costPrice;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + "and the profit percentage is " + (profit / costPrice) * 100 + "%");

    }
}
