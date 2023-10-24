public class App{
    public static void main(String[] args){

        double x = 3.14;
        double y = -10;
        

        double z = Math.max(x,y); //greatest value amounng 2 values
        double z2 = Math.min(x,y); //smallest value among 2
        double z3 = Math.abs(y); // displays the absolute value
        double Z4 = Math.sqrt(x);//gest teh sqrt of the number
        double z5 = Math.round(x);//rounds the number
        double z6 = Math.ceil(x);//always rounds ip
        double z7 = Math.floor(x);// always rounds down

        System.out.println(z);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(Z4);
        System.out.println(z5);
        System.out.println(z6);
        System.out.println(z7);

    }
}
