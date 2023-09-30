public  class Ballon {
    
    String type;
    String couleur;
    int nombre;

    Ballon(){
        this("normal", "invisible", 0);

    }
    Ballon(String type, String couleur, int nombre){
        this.type = type;
        this.couleur = couleur;
        this.nombre = nombre;

    }
    public void quelleType(String type) {
        this.type = type;

    }

    public void quelleCouleur(String couleur){
        this.couleur = couleur;
    }
       
    public void combienBall(int nombre) {
        this.nombre = nombre;

    }

}

