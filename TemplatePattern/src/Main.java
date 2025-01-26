public class Main {
    public static void main(String[] args) {
        System.out.println("Making tea:");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\nMaking coffee:");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}