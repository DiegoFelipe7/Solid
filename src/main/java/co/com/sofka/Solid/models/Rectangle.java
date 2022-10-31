package co.com.sofka.Solid.models;

import co.com.sofka.Solid.interfaces.IFigure;
import co.com.sofka.Solid.interfaces.IPerimeter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle extends Figure implements IFigure, IPerimeter {
    private double width;
    private double height;
    @Override
    public double area() {
        return this.getHeight()*this.getWidth();
    }

    @Override
    public boolean isRegular() {
        return false;
    }


    @Override
    public String perimeter() {
        return "the perimeter is : "+2*(width*height);
    }
}
