public class MaxProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // กรณีไม่มีข้อมูลราคาหุ้น
        }
        
        int minPrice = Integer.MAX_VALUE; // ราคาหุ้นต่ำสุดที่พบ
        int maxProfit = 0; // กำไรสูงสุด
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // อัปเดตราคาหุ้นที่ต่ำสุด
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // คำนวณกำไรสูงสุด
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        
        System.out.println("Max Profit (Test Case 1): " + maxProfit(prices1)); // 5
        System.out.println("Max Profit (Test Case 2): " + maxProfit(prices2)); // 0
    }
}