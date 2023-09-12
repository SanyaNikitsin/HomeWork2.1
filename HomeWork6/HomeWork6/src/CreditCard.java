public class CreditCard {
    String AccountNumber;
    int ActualSum;

    public CreditCard(String AccountNumber, int ActualSum) {
        this.AccountNumber = AccountNumber;
        this.ActualSum = ActualSum;
    }

    public void addSum(int sum) {
        ActualSum += sum;
    }

    public void minusSum(int minusSum) {
        ActualSum -= minusSum;
    }

    public String actualInformation() {
        return "AccountNumber:" + AccountNumber + "\nActual Sum: " + ActualSum;
    }
}