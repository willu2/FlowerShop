import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuBuillder {

    public void mainManu(){
        System.out.println("Menu :> ");
        System.out.println(" 1 :> Show all stuffs ");
        System.out.println(" 2 :> Show all bouquets  >>> ");
        System.out.println(" 3 :> Createte bouquet  >>> ");
        //System.out.println(" 4 :> Show by price >>> ");
        System.out.println(" 8 :> Exit ");

        System.out.println("Enter position :> ");
    }

   /* public void flowersShow(){
        System.out.println("What flower bouquet do you want: ");
        for (int i = 0; i < FlowerEntity.VazonName.values().length; i++){
            System.out.println((i+1) + " :> " + FlowerEntity.VazonName.values()[i] + "  |");
        }
    }

    public void flowersShowBouqet(int i, int counts){
            System.out.println((i+1) + " :> " + FlowerEntity.VazonName.values()[i] + "  |");
        }
*/

    public void bouqetMenu(){
        System.out.println("Enter value: ");
        System.out.println(" 1 :> ADD Flower ");
        System.out.println(" 2 :> Remove Flower ");
    }

    public void enterNumberMenu(){
        System.out.println("Enter number of flower: ");
    }
    public void yourBouqet(){
        System.out.println("Your bouqet: ");
    }

    public void priceEnter(){
        System.out.println("Enter your money count:");
    }

    public void sortShow(){
        System.out.println("Sort by price:");
    }

    public int menuTotalPriceEnter(){
        int visitorPrice = 0;

        try {
            while (visitorPrice <= 0 ){
                try {
                    BufferedReader inPrice = new BufferedReader(new InputStreamReader(System.in));
                    visitorPrice = Integer.parseInt(inPrice.readLine());
                }catch (NumberFormatException c){}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return visitorPrice;
    }
}
