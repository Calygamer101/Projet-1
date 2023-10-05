public class Ballon {

    private String type;
    private String couleur;
    private int nombre;

    Ballon() {
        this("normal", "invisible", 0);

    }

    Ballon(String type, String couleur, int nombre) {
        setType(type);
        setCouleur(couleur);
        setNombre(nombre);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getType() {
        return type;
    }

    public int getNombre() {
        return nombre;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        String output = "";
        output += "quelleType" + " " + this.type + "; ";
        output += "quelleCouleur" + " " + this.couleur + "; ";
        output += "combienBall" + " " + this.nombre + "; ";
        return output;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ballon)) {
            return false;
        }
        Ballon o = (Ballon) other;

        return (o.type).equals(this.type)
                && (o.couleur).equals(this.couleur)
                && o.nombre == this.nombre;
    }
}
