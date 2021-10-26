public abstract class mailaccountTemplate {

    private void acceptInputs() {
        System.out.println("Accepting email id to create account");
    }

    abstract void register();

    public final void createAccount() {
        acceptInputs();

        register();

        displayConfirmation();
    }

    private void displayConfirmation() {
        System.out.println("Account created!!");
    }
}
