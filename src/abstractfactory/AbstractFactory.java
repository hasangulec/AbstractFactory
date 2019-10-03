package abstractfactory;
public class AbstractFactory {

    public static void main(String[] args) {

        Factory fak = new FabrikaA();
        
        fak.createshape().draw();
        fak.createcolor().fill();
       
        
    }
}
