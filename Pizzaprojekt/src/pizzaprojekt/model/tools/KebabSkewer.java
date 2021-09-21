package pizzaprojekt.model.tools;
import pizzaprojekt.control.Doepi;
import pizzaprojekt.model.food.Kebab;

public class KebabSkewer{

    private double status;
    private double price;
    private boolean getConsumed;
    private int numberSkewer;
    private Kebab kebab;
    private Doepi doepi;
    private Money money;

    public KebabSkewer(Money money){
        status = 100;
        numberSkewer = 5;
        this.money = money;
    }


    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        status = status;
    }

    public void useSkewer(){
        if(numberSkewer >= 1){
            if (getConsumed){
                status = status - 1.5;
                if (status <= 0) {
                    doepi.makeKebabSkewer();
                }
            }
        }else{
            doepi.makeKebabSkewer();
        }
        money.setBalance(5);
    }

    public void makeKebab(){
        Kebab kebab = new Kebab(this);
    }

    public int getNumberSkewer(){
        return numberSkewer;
    }

    public void setNumberSkewer(int skewer){
        this.numberSkewer = numberSkewer;
    }

   public boolean skewerLeft(){
        if (status <= 0){
            numberSkewer = numberSkewer - 1;
            return true;
        }else{
            System.out.println("Alle Dönerspieße sind leer!");
            return false;
        }
    }
}
