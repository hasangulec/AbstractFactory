package abstractfactory;
public abstract class Factory {
    abstract Shape createshape();
    abstract Color createcolor();
}
interface Shape  {
    public void draw();
}
interface Color{
    public void fill();
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Dikdörtgen");
    }
}
class Triangle implements Shape{
    public void draw(){
        System.out.println("Üçgen");
    }
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Daire");
    }
}
class Red implements Color{
    public void fill(){
        System.out.println("Kırmızı");
    }
}
class Blue implements Color{
    public void fill(){
        System.out.println("Mavi");
    }
}
class Green implements Color{
    public void fill(){
        System.out.println("Yeşil");
    }
}
class FabrikaA extends Factory{
    public Shape shape;
    public Color color;
    public FabrikaA(){
        shape = createshape();
        color = createcolor();
    }
    public Shape createshape(){
        return new Triangle();
    }
    public Color createcolor(){
        return new Green();
    }
}