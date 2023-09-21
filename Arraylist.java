import java.util.ArrayList;
 class arraylist1{
public static void main(String[] args){
    //create an object for arraylist
    ArrayList<string> num= new ArrayList<>();
    //Adding element to the arraylist
    num.add(10);
    num.add(20);
    num.add(30);
    num.add(40);
    num.add(50);
    //Accessing array element
    System.out.println(num.get(1));
    //iterating the arraylist
    for(int n:num){
        System.out.println(n);
    }
    System.out.println(num.size());
    num.remove(1);
    System.out.println(num.size());
boolean have=num.contains(20);
System.out.println(have);
}
}