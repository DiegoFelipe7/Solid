package co.com.sofka.Solid.models;

import co.com.sofka.Solid.interfaces.IFigure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circle extends Figure implements IFigure {
    private double radio;
    @Override
    public double area() {
        return Math.PI*Math.pow(getRadio(),2);
    }

    @Override
    public boolean isRegular() {
        return true;
    }
}
