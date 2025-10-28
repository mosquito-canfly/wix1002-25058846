package l1q4;
public class chart {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June"};
        int[] amount = {2500, 1600, 2000, 2700, 3200, 800};

        System.out.println("Total Sales of Product A (Bar Chart)");
        System.out.println("-----------------------------------");

        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s | ", months[i]);
            int barLength = amount[i] / 100; 
            for (int j = 0; j < barLength; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
