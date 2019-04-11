package flower.vbn.com;

//main manu show class
public class ShowMenu {

    MenuBuillder menu = new MenuBuillder();
    DataCreator dataCreator = new DataCreator();

    boolean exit = false;

    public ShowMenu() {
    }

    public void show() {
        do {
            int item = 0;
            int price = 0;

            menu.mainManu();

            switch (menu.menuTotalPriceEnter()) {
                case 1:
                    dataCreator.showAllFlowerpots();
                    dataCreator.showAllData();
                    break;
                case 2:
                    dataCreator.showAllBouqets();
                    break;
                case 3:
                    dataCreator.flowersShow();
                    item = menu.menuTotalPriceEnter();
                    menu.enterNumberMenu();
                    price = menu.menuTotalPriceEnter();
                    dataCreator.flowersShowBouqet(item, price);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Try again...");
            }
        } while (!exit);
    }
}
