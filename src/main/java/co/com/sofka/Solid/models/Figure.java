package co.com.sofka.Solid.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Figure  {
    private String typeOfFigure;
    public abstract double area();
}
