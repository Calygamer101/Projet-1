public class Main {
    public static void main(String[] args) {
        Ballon b1 = new Ballon();
        Ballon b2 = new Ballon();

        b1.quelleType("Ballon de soccer");
        b2.quelleType("Ballon de bascketball ");

        b1.quelleCouleur("Ballon noir");
        b2.quelleCouleur("Ballon orange");

        b1.combienBall(12);
        b2.combienBall(1);

        System.out.println("B1");
        System.out.println("Type:" + b1.type);
        System.out.println("Couleur:" + b1.couleur);
        System.out.println("Nombre:" + b1.nombre);

        System.out.println("B2");
        System.out.println("Type:" + b2.type);
        System.out.println("Couleur:" +b2.couleur);
        System.out.println("Nombre:" +b2.nombre);
        
    }
}