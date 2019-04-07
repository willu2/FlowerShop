import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuBuillder {

    public void mainManu(){
        System.out.println("Menu :> ");
        System.out.println(" 1 :> Show all flowers ");
        System.out.println(" 2 :> Show by clarity  >>> ");
        System.out.println(" 3 :> Show by price >>> ");
        System.out.println(" 4 :> Show hierarchy >>> ");
        System.out.println(" 5 :> Sort by price >>> ");
        System.out.println(" 8 :> Exit ");

        System.out.println("Enter position :> ");
    }

    public void flowersShow(){
        System.out.println("Enter flower: ");
        for (int i = 0; i < FlowerEntity.FlowerName.values().length; i++){
            System.out.print((i+1) + " :> "+FlowerEntity.FlowerName.values()[i] + " |*|");
        }
    }
    public void typeShow(){
        System.out.println("Enter value: ");
        System.out.print(" 1 :> PRECIOS |*|");
        System.out.println(" 2 :> HALFPRECIOUS |*|");
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
