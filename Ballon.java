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
    
    @Override
     public String toString(){
        String output = "";
        output += "quelleType" + " " + this.type + "; ";
        output += "quelleCouleur" + " " + this.couleur + "; ";
        output += "combienNombre" + " " + this.nombre + "; ";
        return output;
     }

     @Override
     public boolean equals(Object other) {
        if (this ==  other) {
            return true;
        }
        if (!(other instanceof Ballon)) {
            return false;
        }
        Ballon o = (Ballon)other;

        return (o.type).equals(this.type)
            && (o.couleur).equals(this.couleur)
            && o.nombre == this.nombre;
     }
}

