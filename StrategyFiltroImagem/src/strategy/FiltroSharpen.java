/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import static strategy.SaveImage.SHARPEN3x3;

/**
 *
 * @author Juliana Yuri
 */
public class FiltroSharpen extends Filtro{
    
    @Override
    public BufferedImageOp aplicaFiltro(){
        float[] data = SHARPEN3x3;
        return new ConvolveOp(new Kernel(3, 3, data),ConvolveOp.EDGE_NO_OP,null);
    }
}
