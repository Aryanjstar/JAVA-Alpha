

public class Linearsearch {

    public static int Linearsearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        } 
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,5,68,9,75,26,28,31};
        int key =26;
        int index = Linearsearch(numbers, key);
        if(index==-1){
            System.out.println("Not Found");
        } 
        else{
            System.out.println("Found at Index: " + index);
        }
    }
    }

