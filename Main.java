public class Main {
    public static void main(String[] args) {
        Ballon b1 = new Ballon();
        Ballon b2 = new Ballon();

        System.out.println("Original");
        System.out.println(b1);


        b1.quelleType("Ballon de soccer");
        b2.quelleType("Ballon de bascketball ");


        b1.quelleCouleur("Ballon noir");
        b2.quelleCouleur("Ballon orange");


        b1.combienBall(12);
        b2.combienBall(1);

        System.out.println("B1");
        System.out.println(b1);
       
        System.out.println("B2");
        System.out.println(b2);

        System.out.println(b1.equals(b2));
        
    }
}