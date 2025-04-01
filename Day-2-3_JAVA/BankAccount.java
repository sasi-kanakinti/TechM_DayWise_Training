class BankAccount {
    private double balance;
    private String owner;

    public BankAccount() {
        this(0);
    }

    public BankAccount(double balance) {
        this(balance, "Unknown");
    }

    public BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount(1000);
        BankAccount acc3 = new BankAccount(5000, "John Doe");
        System.out.println(acc1.owner+ "'s balance: " + acc1.balance);
        System.out.println(acc2.owner + "'s balance: " + acc2.balance);
        System.out.println(acc3.owner + "'s balance: " + acc3.balance);
    }
}
