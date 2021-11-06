
/**
 * 
 *
 * Ian T. Webster
 * 4/26/2021
 */
public class Commission extends Hourly
{
    double totalSales;
    double commissionRate;
    public Commission(String eName, String eAddress, String ePhone,
String socSecNumber, double rate, double comRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = comRate;
    }

    public void addSales(double tSales)
    {
        totalSales+=tSales;
    }
    
    public double pay(){
        double payment = commissionRate*totalSales;
        totalSales = 0;
        return super.pay()+payment;
    }
    
    
}
