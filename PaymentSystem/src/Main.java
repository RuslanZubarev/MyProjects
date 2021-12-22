public class Main {
    public static void main(String[] args) {
        BankDetails details = new BankDetails();
        details.setBillNumber("1111111");
        Company company = new Company("Name of Company", details);
        details.setBillNumber("11111222");
        System.out.println(company);


    }
}
