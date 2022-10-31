package co.com.sofka.Solid;

import co.com.sofka.Solid.models.Circle;
import co.com.sofka.Solid.models.Rectangle;
import co.com.sofka.Solid.models.Triangle;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.BiConsumer;


@SpringBootApplication
public class SolidApplication implements CommandLineRunner, BiConsumer<Boolean,Double > {
	public static void main(String[] args) {
		SpringApplication.run(SolidApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		solid();
	}
	public void solid(){
		System.out.println("Circle");
		Circle circle = new Circle(5);

		var areCircle = circle.area();
		accept(circle.isRegular(),areCircle);

		System.out.println("Rectangle");
		Rectangle rectangle = new Rectangle(4,8);
		System.out.println(rectangle.perimeter());
		var areaRectangle = rectangle.area();
		accept(rectangle.isRegular(),areaRectangle);


		System.out.println("Triangle");
		Triangle triangle = new Triangle(4,9);
		var areTriangle=triangle.area();
		accept(triangle.isRegular(),areTriangle);

	}


	@Override
	public void accept(Boolean aBoolean, Double area) {
		System.out.println("The figure is regular : " + aBoolean);
		System.out.println("The area of the figure is : "  + area);
	}
}
