public class FurnitureItem {

    public void discountedbill( int totalbill, int discountpercentage){
        int discountedbill= totalbill-(totalbill*discountpercentage/100);
        System.out.println("discountedbill" +discountedbill);
    }
    public static void main (String [] args){
        String colour[] = {"red","blue","green"};
        int grade[]={1,2,3};
        String furnituretype[]={"tables","chairs","stools","cupboards"};
        int discountpercentage= 5;
        int totalbill=450;
        FurnitureItem furniture =new FurnitureItem();
        furniture.discountedbill(totalbill, discountpercentage);


    }
}
