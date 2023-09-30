

public class arg {

    public static void update(int marks[]){
       int non_changable = 10;
       for(int i=0; i<marks.length; i++){
        marks[i] = marks[i]+1;
       }
    }
    public static void main(String args[]){
int non_changable = 5;
int marks[] = {97,98,99};
update(marks);
for(int i=0; i<marks.length; i++){
    System.out.print(marks[i]+" ");
}
    System.out.println();
    System.out.print(non_changable);
    }
}
