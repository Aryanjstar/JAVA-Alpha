

public class LinearSearchString {

    public static int LinearSearch(String food[], String key){
        for(int i=0; i<food.length; i++){
            if(food[i]==key){
                return i;
            }
        } 
        return -1;
    }
    public static void main(String args[]){
        String food[] = {"Paneer", "Chole Bhature", "Pani-Poori"};
        String key ="Paneer";
        int index = LinearSearch(food, key);
        if(index==-1){
            System.out.println("Not Found");
        } 
        else{
            System.out.println("Found at Index: " + index);
        }
    }
    }

