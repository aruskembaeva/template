public class Main {
    public static void main(String[] args) {
        mailaccountTemplate gmail = new Gmailaccount();
        gmail.createAccount();
        System.out.println();
        mailaccountTemplate ymail = new Yahooaccount();
        ymail.createAccount();

        }
}
