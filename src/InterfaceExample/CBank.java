package InterfaceExample;

public class CBank implements IBank{
    private String bankName;
    private String terminalID;
    private String password;

    public CBank(String bankName, String terminalID, String password) {
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip : " + ipAddress);
        System.out.println("Makina ip : " + this.hostIpAddress);
        System.out.println(this.bankName + " Bankasına bağlanıldı.");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expireDate, String cvc) {
        // Banka ödeme işlemleri
        System.out.println("Bankadan cevap bekleniyor...");
        System.out.println("İşlem başarılı oldu.");
        return true;
    }
}
