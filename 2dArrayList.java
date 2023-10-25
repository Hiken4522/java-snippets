import java.util.*;

public class App{
    public static void main(String[] args){

        ArrayList<ArrayList<String>> grocerylist = new ArrayList<>();

        ArrayList<String> bakerylist = new ArrayList<String>();
        bakerylist.add("pasta");
        bakerylist.add("garlic bread");
        bakerylist.add("donuts"); 

        ArrayList<String> producelist = new ArrayList<String>();
        producelist.add("tomatoes");
        producelist.add("zuchini");
        producelist.add("peppers"); 

        ArrayList<String> drinkslist = new ArrayList<String>();
        drinkslist.add("soda");
        drinkslist.add("coffee");

        grocerylist.add(bakerylist);
        grocerylist.add(producelist);
        grocerylist.add(drinkslist);

         

        System.out.println(grocerylist.get(0).get(2));

    }
}
