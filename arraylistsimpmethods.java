import java.util.ArrayList;

public class App{
    public static void main(String[] args){

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("hamburger");
        food.add("hotdog");
        //few useful methods of arraylist
        food.set(0,"sushi");//toreplace a value at a certain index
        food.remove(2);//to remove an element at a certain index
        food.clear();//to clear an arraylist


        for(int i = 0; i<food.size();i++){

            System.out.println(food.get(i));
        }

    }
}
