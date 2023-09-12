public class main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("Card1", 120);
        CreditCard card2 = new CreditCard("Card2", 150);
        CreditCard card3 = new CreditCard("Card3",1000);
        card1.addSum(500);
        card2.addSum(600);
        card3.minusSum(200);
        System.out.println("Actual Information\n" + "card1 "+card1.actualInformation());
        System.out.println("Actual Information\n" + "card2 "+card2.actualInformation());
        System.out.println("Actual Information\n" + "card3 "+card3.actualInformation());
    }
}
