import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Rectangle;
import com.workintech.pool.Cuboid;
import com.workintech.developers.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ SİLİNDİR TEST ------");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("\n------ HAVUZ TEST ------");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        
        System.out.println("\n------ DEVELOPER TEST ------");
        JuniorDeveloper junior = new JuniorDeveloper(1, "Ahmet", 30000);
        junior.work();
        
        MidDeveloper mid = new MidDeveloper(2, "Ayşe", 45000);
        mid.work();
        
        SeniorDeveloper senior = new SeniorDeveloper(3, "Mehmet", 65000);
        senior.work();
        
        HRManager hr = new HRManager(4, "Zeynep", 50000);
        hr.work();
        hr.addEmployee(0, junior);
    }
}