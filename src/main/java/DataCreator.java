import java.util.*;

public class DataCreator {

    public List allFlowersInfo;// = new ArrayList<FlowerEntity>();
    public FlowerEntity entity;

    public List allVazone;// = new ArrayList<FlowerEntity>();
    public VazonItem vazonItem;

    public DataCreator() {
        allFlowersInfo = new ArrayList<FlowerEntity>();
        allVazone = new ArrayList<VazonItem>();
        createFlowersPrice();
        createVazonePrice();
    }

    private void createFlowersPrice(){
        for (int i = 0; i < FlowerEntity.FlowerName.values().length; i++){
            entity = new FlowerEntity(FlowerEntity.FlowerName.values()[i], ranDig(40));
            allFlowersInfo.add(entity);
        }
    }

    private void createVazonePrice(){
        for (int i = 0; i < VazonItem.VazonName.values().length; i++){
            vazonItem = new VazonItem(VazonItem.VazonName.values()[i], ranDig(30));
            allVazone.add(vazonItem);
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

    public int ranDig(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 12;
        return digit;
    }

    public void showAllData(){
        sortItemList();
        for (Iterator<FlowerEntity> it = allFlowersInfo.iterator(); it.hasNext(); ) {
            FlowerEntity flowerEntity = it.next();
            printItemList(flowerEntity);
        }
    }
    public void showAllVazes(){
        sortItemList();
        for (Iterator<VazonItem> it = allVazone.iterator(); it.hasNext(); ) {
            VazonItem vazonItem = it.next();
            printVazoneItem(vazonItem);
        }
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
       // iterationPrint(allFlowersInfo);
    }

    public void sortReverseItemList(){
        Collections.sort(allFlowersInfo, Collections.reverseOrder());
        iterationPrint(allFlowersInfo);
    }

    public void bouqetCreator(){

    }

    public void iterationPrint(List<FlowerEntity> entityList){
        for (Iterator<FlowerEntity> it = entityList.iterator(); it.hasNext(); ) {
            FlowerEntity flowerEntity = it.next();
            printItemList(flowerEntity);
        }
    }


    private void printItemList(FlowerEntity flowerEntity){
        System.out.print("Flower name:  > " + flowerEntity.getVazonName());
        //System.out.print(" ||_type: > " + flowerEntity.getStoneType());
        System.out.print(" ||_price: > " + flowerEntity.getPrice() + " $");
        System.out.println();
    }

    private void printVazoneItem(VazonItem vazonItem){
        System.out.print("Vazone:  > " + vazonItem.getVazonName());
        //System.out.print(" ||_type: > " + flowerEntity.getStoneType());
        System.out.print(" ||_price: > " + vazonItem.getPrice() + " $");
        System.out.println();
    }

    private void printBouquet(FlowerEntity flowerEntity, int counts){
        System.out.print("Bouquet:  > " + flowerEntity.getVazonName());
        //System.out.print(" ||_type: > " + flowerEntity.getStoneType());
        System.out.print(" ||_price: > " + flowerEntity.getPrice() * counts + " $");
        System.out.println();
    }

    private void printBouqetList(FlowerEntity flowerEntity){
        System.out.print("Flower name: 5 > " + flowerEntity.getVazonName());
        //System.out.print(" ||_type: > " + flowerEntity.getStoneType());
        System.out.print(" ||_price: > " + (flowerEntity.getPrice() * 5) + " $");
        System.out.println();
    }




}
