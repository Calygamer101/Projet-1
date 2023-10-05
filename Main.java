public class Main {
    public static void main(String[] args) {
        Ballon b1 = new Ballon();
        Ballon b2 = new Ballon();

        System.out.println("Original");
        System.out.println(b1);


        b1.setType("Ballon de soccer");
        b2.setType("Ballon de bascketball ");

        b2.getNombre();


        b1.setCouleur("Ballon noir");
        b2.setCouleur("Ballon orange");

        b1.setNombre(12);
        b2.setNombre(1);

        System.out.println("B1");
        System.out.println(b1);
       
        System.out.println("B2");
        System.out.println(b2);

        System.out.println(b1.equals(b2));
        
    }
}