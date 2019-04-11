package flower.vbn.com;

import java.util.*;

/*create data class*/
public class DataCreator {

    public List allFlowersInfo;
    public FlowerEntity entity;

    public List allFlowerpots;
    public FlowerpotItem flowerpotItem;

    public DataCreator() {
        allFlowersInfo = new ArrayList<FlowerEntity>();
        allFlowerpots = new ArrayList<FlowerpotItem>();
        createFlowersPrice();
        createFlowerpotPrice();
    }

    public void showAllData(){
        sortItemList();
        for (Iterator<FlowerEntity> it = allFlowersInfo.iterator(); it.hasNext(); ) {
            FlowerEntity flowerEntity = it.next();
            printItemList(flowerEntity);
        }
    }

    public void showAllFlowerpots(){
        sortItemList();
        for (Iterator<FlowerpotItem> it = allFlowerpots.iterator(); it.hasNext(); ) {
            FlowerpotItem flowerpotItem = it.next();
            printFlowerpotItem(flowerpotItem);
        }
    }
    public void flowersShow(){
        System.out.println("Enter flower number: ");
        for (int i = 0; i < FlowerEntity.FlowerName.values().length; i++){
            System.out.println((i+1) + " :> " +" " + FlowerEntity.FlowerName.values()[i] + "  |");
        }
    }

    public void flowersShowBouqet(int i, int counts){
        i-=1;
        if(i > allFlowersInfo.size() || i < 0){
            return;
        }
        FlowerEntity flowerEntity = (FlowerEntity) allFlowersInfo.get(i);
        printBouquet(flowerEntity, counts);
    }

    private void createFlowersPrice(){
        for (int i = 0; i < FlowerEntity.FlowerName.values().length; i++){
            entity = new FlowerEntity(FlowerEntity.FlowerName.values()[i], ranDig(40));
            allFlowersInfo.add(entity);
        }
    }

    private void createFlowerpotPrice(){
        for (int i = 0; i < FlowerpotItem.FlowerpotName.values().length; i++){
            flowerpotItem = new FlowerpotItem(FlowerpotItem.FlowerpotName.values()[i], ranDig(30));
            allFlowerpots.add(flowerpotItem);
        }
    }

    public int ranDig(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 12;
        return digit;
    }

    public void showAllBouqets(){
        sortItemList();
        for (Iterator<FlowerEntity> it = allFlowersInfo.iterator(); it.hasNext(); ) {
            FlowerEntity flowerEntity = it.next();
            printBouqetList(flowerEntity);
        }
    }

    public void sortItemList(){
        Collections.sort(allFlowersInfo);
    }

    private void printItemList(FlowerEntity flowerEntity){
        System.out.print("Flower name:  > " + flowerEntity.getVazonName());
        System.out.print(" ||_price: > " + flowerEntity.getPrice() + " $");
        System.out.println();
    }

    private void printFlowerpotItem(FlowerpotItem flowerpotItem){
        System.out.print("Vazone:  > " + flowerpotItem.getFlowerpotName());
        System.out.print(" ||_price: > " + flowerpotItem.getPrice() + " $");
        System.out.println();
    }

    private void printBouquet(FlowerEntity flowerEntity, int counts){
        System.out.print("Bouquet:  > " + flowerEntity.getVazonName());
        System.out.print(" ||_price: > " + flowerEntity.getPrice() * counts + " $");
        System.out.println();
    }

    private void printBouqetList(FlowerEntity flowerEntity){
        System.out.print("Flower name: 5 > " + flowerEntity.getVazonName());
        System.out.print(" ||_price: > " + (flowerEntity.getPrice() * 5) + " $");
        System.out.println();
    }
}
