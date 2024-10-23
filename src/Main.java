
import secondactivity.Forme;
import thirdactivity.dessinateurforme;
import secondactivity.cercle;
import secondactivity.triangle;
public class Main {
    public static void main(String[] args) {
        /*Cercle cercle = new Cercle();
        Triangle triangle = new Triangle();
        cercle.dessiner();
        triangle.dessiner();*/
        //actvité trois
        Forme cercle = new cercle();
        Forme triangle = new triangle();


        dessinateurforme dessinateur = new dessinateurforme();


        dessinateur.dessinerForme(cercle);
        dessinateur.dessinerForme(triangle);
    }

}