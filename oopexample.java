class Human{
    String name;
    int age;
    int weight;
    Human(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
    



class App{
    public static void main(String[] args){

        Human obj = new Human("rick",45,30);
        Human obj1 = new Human("morty",12,23);

        System.out.println(obj.name);
        System.out.println(obj1.name+","+obj1.age);

    }
} 
