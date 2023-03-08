/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package raven.glasspanepopup;
import java.awt.Color;
import java.awt.Component;
import net.miginfocom.layout.LayoutCallback;
/**
 *
 * @author vashtileonie
 */
public interface Option {
   public LayoutCallback getLayoutCallBack(Component parent);

    public String getLayout(Component parent, float animate);

    public boolean closeWhenClickOutside();

    public boolean blockBackground();

    public Color background();

    public float opacity();

    public int duration();

    public float getAnimate();

    void setAnimate(float animate);
}
