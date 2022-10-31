package co.com.sofka.Solid.models;

import co.com.sofka.Solid.interfaces.IFigure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Triangle extends Figure implements IFigure {
    private double base;
    private double height;

    @Override
    public double area() {
        return this.base*this.getHeight()/2;
    }

    @Override
    public boolean isRegular() {
        return true;
    }
}
