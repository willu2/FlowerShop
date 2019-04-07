import java.util.*;

public class DataCreator {

    public List allFlowersInfo;// = new ArrayList<FlowerEntity>();
    public FlowerEntity entity;

    public DataCreator() {
        allFlowersInfo = new ArrayList<FlowerEntity>();
        createFlowersPrice();
    }

    private void createFlowersPrice(){
        for (int i = 0; i < FlowerEntity.FlowerName.values().length; i++){
            entity = new FlowerEntity(FlowerEntity.FlowerName.values()[i], ranDig(40));
            allFlowersInfo.add(entity);
        }
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

    public void sortItemList(){
        Collections.sort(allFlowersInfo);
       // iterationPrint(allFlowersInfo);
    }

    public void sortReverseItemList(){
        Collections.sort(allFlowersInfo, Collections.reverseOrder());
        iterationPrint(allFlowersInfo);
    }

    public void iterationPrint(List<FlowerEntity> entityList){
        for (Iterator<FlowerEntity> it = entityList.iterator(); it.hasNext(); ) {
            FlowerEntity flowerEntity = it.next();
            printItemList(flowerEntity);
        }
    }


    private void printItemList(FlowerEntity flowerEntity){
        System.out.print("Flower name:  > " + flowerEntity.getFlowerName());
        //System.out.print(" ||_type: > " + flowerEntity.getStoneType());
        System.out.print(" ||_price: > " + flowerEntity.getPrice() + " $");
        System.out.println();
    }




}
