/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esame201409;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

/**
 * @author Matteo Franzil
 */
public class Plus extends Polygon {

    public Plus(double size) {
        double x = 0;
        double y = 0;

        getPoints().addAll(
                x, y,
                x, y + size / 2,
                x - size / 6, y + size / 2,
                x - size / 6, y,
                x - size / 6 - size / 2, y,
                x - size / 6 - size / 2, y - size / 6,
                x - size / 6, y - size / 6,
                x - size / 6, y - size / 6 - size / 2,
                x, y - size / 6 - size / 2,
                x, y - size / 6,
                x + size / 2, y - size / 6,
                x + size / 2, y
        );

        setFill(Color.DARKSLATEBLUE);
    }

}
