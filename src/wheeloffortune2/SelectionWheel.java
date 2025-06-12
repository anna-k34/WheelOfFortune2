/*
 * Laura Garcia and Anna Kelley
 * June 11th, 2025
 * This code was taken from the source https://www.codeproject.com/Articles/5272754/Wheel-of-Fortune-in-Java
 */

package wheeloffortune2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Polygon;
import java.util.ArrayList;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class SelectionWheel extends JPanel {

    Wheel _wheel;
    Tick _tick;

    /**
     * a method that adjusts the bounds of the wheel and tick based on the tick width
     * @param x - the new x position of the wheel
     * @param y - the new y position of the wheel
     * @param width - the new width of the wheel
     * @param height - the new height of the wheel
     */
    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);

        // Set bounds of the wheel to take full panel
        _wheel.setBounds(0, 0, width, height);

        // Tick size
        int tickWidth = _tick.getTickWidth();
        int tickHeight = _tick.getTickHeight();

        // Place tick at top center above the wheel
        int tickX = (width - tickWidth) / 2;
        int tickY = -10; // or a bit above, like -10 for overlap

        _tick.setBounds(tickX, tickY, tickWidth, tickHeight);
    }

    /**
     * a method that checks if the wheel has borders on it
     * @param borders - the boolean that indicates whether the wheel has borders on it
     */
    public void hasBorders(boolean borders) {
        _wheel.hasBorders(borders);
    }

    /**
     * an accessor method for the radius of the wheel
     * @return the radius of the wheel
     */
    public int getRadius() {
        return _wheel.getRadius();
    }

    /**
     * an accessor method for the rotation angle of the wheel
     * @return the rotation angle of the wheel
     */
    public double getRotationAngle() {
        return _wheel.getRotationAngle();
    }

    /**
     * a mutator method for the rotation angle of the wheel
     * @param rotationAngle - the rotation angle of the wheel
     */
    public void setRotationAngle(double rotationAngle) {
        _wheel.setRotationAngle(rotationAngle);
        rotationAngle = rotationAngle % 360;
        this.repaint();
        if (getParent() != null) {
            for (Component c : getParent().getComponents()) {
                if (c instanceof Tick) {
                    c.repaint();
                }
            }
        }

    }

    /**
     * an accessor method for the font of the labels of the wheel
     * @return the current font of the wheel
     */
    public Font getWheelFont() {
        return _wheel.getFont();
    }

    /**
     * a mutator method for the font of the labels of the wheel
     * @param font - the font for the labels
     */
    public void setWheelFont(Font font) {
        super.setFont(font);
        _wheel.setFont(font);
    }

    /**
     * an accessor method for the array list of strings displayed on the wheel
     * @return the array list of strings containing the information for the labels
     */
    public ArrayList<String> getListOfStrings() {
        return _wheel.getListOfStrings();
    }

    /**
     * a mutator method for the array list of strings displayed on the wheel
     * @param list - the array list of strings containing the information for the labels
     * @throws Exception - if the array list of strings is over the limit of 100
     */
    public void setListOfStrings(ArrayList<String> list) throws Exception {
        _wheel.setListOfStrings(list);
    }

    /**
     * an accessor method for the current spin speed of the wheel
     * @return the spin speed of the wheel
     */
    public double getSpinSpeed() {
        return _wheel.getSpinSpeed();
    }

    /**
     * an accessor method for the current spin speed limit of the wheel
     * @return the spin speed limit of the wheel
     */
    public double getMaxSpinSpeed() {
        return _wheel.getMaxSpinSpeed();
    }

    /**
     * a mutator method for the spin speed limit of the wheel
     * @param speed - the spin speed limit of the wheel
     */
    public void setMaxSpinSpeed(double speed) {
        _wheel.setMaxSpinSpeed(speed);
    }

    /**
     * an accessor method for the spin deceleration of the wheel
     * @return the spin deceleration of the wheel
     */
    public double getSpinDeceleration() {
        return _wheel.getSpinDeceleration();
    }

    /**
     * a mutator method for the spin deceleration of the wheel
     * @param deceleration - the spin deceleration of the wheel
     * @throws Exception - if the spin deceleration is positive (if it is positive it is accelerating not decelerating)
     */
    public void setSpinDeceleration(double deceleration) throws Exception {
        _wheel.setSpinDeceleration(deceleration);
    }

    /**
     * an accessor method for the array list of colours that creates the colour scheme of the wheel
     * @return the array list of colours
     */
    public ArrayList<Color> getColorScheme() {
        return _wheel.getColorScheme();
    }

    /**
     * a mutator method for the array list of colours that creates the colour scheme of the wheel
     * @param colors - the array list of colours
     */
    public void setColorScheme(ArrayList<Color> colors) {
        _wheel.setColorScheme(colors);
    }

    /**
     * a method that adds a new colour to the colour scheme of the wheel
     * @param color -  the colour being added
     */
    public void addColor(Color color) {
        _wheel.addColor(color);
    }

    /**
     * an accessor method for the current string selection of the wheel
     * @return the current string selection of the wheel
     */
    public String getSelectedString() {
        return _wheel.getSelectedString();
    }

    /**
     * a method that checks if the wheel is spinning
     * @return the boolean of whether the wheel is spinning
     */
    public boolean isSpinning() {
        return _wheel.isSpinning();
    }

    /**
     * a mutator method for the shape of the wheel
     * @param shape - the shape of the wheel 
     */
    public void setShape(Wheel.Shape shape) {
        _wheel.setShape(shape);
    }

    /**
     * an accessor method for the tick width 
     * @return the tick width
     */
    public double getTickWidth() {
        return _tick.getTickWidth();
    }
    
    /**
     * a mutator method that sets the width of the tick
     * this method also resets the bound of both the tick and wheel
     * @param width - the width of the tick
     */
    public void setTickWidth(int width) {
        _tick.setTickWidth(width);
        this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    /**
     * an accessor method for the height of the tick
     * @return the height of the tick
     */
    public double getTickHeight() {
        return _tick.getTickHeight();
    }

    /**
     * a mutator method for the height of the tick
     * @param height - the height of the tick
     */
    public void setTickHeight(int height) {
        _tick.setTickHeight(height);
    }

    /**
     * an accessor method for the polygon of the tick
     * @return the polygon of the tick
     */
    public Polygon getTickPolygon() {
        return _tick.getPolygon();
    }

    /**
     * a mutator method for the polygon of the tick
     * @param polygon the polygon of the tick
     */
    public void setTickPolygon(Polygon polygon) {
        _tick.setPolygon(polygon);
    }

    /**
     * a method that repaints the tick
     */
    public void repaintTick() {
        if (_tick != null) {
            _tick.repaint();
        }
    }

    /**
     * an accessor method for the tick
     * @return the tick
     */
    public Tick getTick() {
        return _tick;
    }

    /**
     * a constructor that allows for the creation of a selection wheel, while initializing the tick and wheel
     * @param listOfStrings - the array list of strings that contains the labels for each segment of the wheel
     * @throws Exception - of the array list of strings is over the limit of 100
     */
    public SelectionWheel(ArrayList<String> listOfStrings) throws Exception {

    // Create wheel and tick
    _wheel = new Wheel(listOfStrings);
    _wheel.setLayout(null);

    _tick = new Tick();
    _tick.setLayout(null);
    _tick.setTickWidth(40);
    _tick.setTickHeight(30);
    _tick.setOpaque(false);
    _tick.setBackground(new Color(0, 0, 0, 0));

    // Set preferred size
    int panelWidth = 350;
    int panelHeight = 350;
    this.setPreferredSize(new Dimension(panelWidth, panelHeight));
    this.setLayout(new BorderLayout());

    // Create layered pane and set bounds/layout
    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setPreferredSize(new Dimension(panelWidth, panelHeight));
    layeredPane.setLayout(null); // absolute positioning

    // Set bounds for wheel and tick
    _wheel.setBounds(0, 0, panelWidth, panelHeight);
    int tickX = (panelWidth - _tick.getTickWidth()) / 2;
    int tickY = 0;
    _tick.setBounds(tickX, tickY, _tick.getTickWidth(), _tick.getTickHeight());

    // Add components to layered pane
    layeredPane.add(_wheel, JLayeredPane.DEFAULT_LAYER);       // behind
    layeredPane.add(_tick, JLayeredPane.PALETTE_LAYER);        // on top

    // Add layered pane to this panel
    this.add(layeredPane, BorderLayout.CENTER);

    // Force repaint to confirm it's showing
    _tick.repaint();
    _wheel.repaint();
    this.repaint();

    }

    /**
     * a method that starts the async wheel spin
     * @param speed - the spin speed of the wheel
     * @param direction - the direction the wheel is traveling (over 0 = clockwise, under 0 = counter clockwise)
     * @param deceleration - the rate at which the wheel is slowing down
     * @throws Exception - if the deceleration is positive (therefore accelerating)
     */
    public void spinStartAsync(double speed, int direction, double deceleration) throws Exception {
        _wheel.spinStartAsync(speed, direction, deceleration);
    }

    /**
     * a method that stops the wheel from spinning
     */
    public void spinStop() {
        _wheel.spinStop();
    }

    /**
     * a method to get the dimensions of the wheel
     * @return the dimensions of the wheel
     */
    @Override
    public java.awt.Dimension getPreferredSize() {
        return new java.awt.Dimension(350, 350); // or whatever size you need
    }
}
