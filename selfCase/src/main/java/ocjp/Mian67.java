package ocjp;

/**
 * @author dongchen
 * @Data 2020/9/30
 * @Time 17:19
 */
public class Mian67 {
    public class Customer {
        ElectricAccount acct = new ElectricAccount();
        public void useElectricity(double kWh) {
            acct.addKWh(kWh);
        }
    }
    public class ElectricAccount {
        private double kWh;
        private double rate = 0.07;
        private double bill;
        public void addKWh(double kWh){
            this.kWh += kWh;
            setBill(this.kWh);
        }
        public void setBill(double kWh){
            bill  = kWh*rate;
        }
    }

}
