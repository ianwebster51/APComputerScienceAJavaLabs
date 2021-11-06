
/**
 * A class that is used to create band booster objects.
 *
 * Ian T. Webster
 * 11/18/2020
 */
public class BandBooster
{
    String name;
    int boxesSold;
    public BandBooster(String blop){
         name  = blop;
         boxesSold = 0;
    }
    public String getName(){return name;}
    public void updateSales(int goop){boxesSold+=goop;}
    public String toString(){
         return (name + " : " + boxesSold + " boxes sold.");
    }
}
