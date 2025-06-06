/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

    @Override
    public void setBounds(int x, int y, int width, int height) {
        /*
		 * Adjust the bounds of the wheel and tick based on tick width.
         */
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

    public void hasBorders(boolean borders) {
        /*
		 * Check if the wheel borders are on.
         */
        _wheel.hasBorders(borders);
    }

    public int getRadius() {
        /*
		 * Get radius of the wheel.
         */
        return _wheel.getRadius();
    }

    public double getRotationAngle() {
        /*
		 * Get current rotation angle of the wheel.
         */
        return _wheel.getRotationAngle();
    }

    public void setRotationAngle(double rotationAngle) {
        /*
		 * Set current rotation angle of the wheel.
         */
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

    public Font getWheelFont() {
        /*
		 * Get current font of the wheel.
         */
        return _wheel.getFont();
    }

    public void setWheelFont(Font font) {
        /*
		 * Set current font of the wheel.
         */
        super.setFont(font);
        _wheel.setFont(font);
    }

    public ArrayList<String> getListOfStrings() {
        /*
		 * Get the list of strings for the wheel.
         */
        return _wheel.getListOfStrings();
    }

    public void setListOfStrings(ArrayList<String> list) throws Exception {
        /*
		 * Set the list of strings for the wheel.
         */
        _wheel.setListOfStrings(list);
    }

    public double getSpinSpeed() {
        /*
		 * Get current spin speed of the wheel.
         */
        return _wheel.getSpinSpeed();
    }

    public double getMaxSpinSpeed() {
        /*
		 * Get current spin speed limit of the wheel.
         */
        return _wheel.getMaxSpinSpeed();
    }

    public void setMaxSpinSpeed(double speed) {
        /*
		 * Set current spin speed limit of the wheel.
         */
        _wheel.setMaxSpinSpeed(speed);
    }

    public double getSpinDeceleration() {
        return _wheel.getSpinDeceleration();
    }

    public void setSpinDeceleration(double deceleration) throws Exception {
        _wheel.setSpinDeceleration(deceleration);
    }

    public ArrayList<Color> getColorScheme() {
        /*
		 * Get color scheme of the wheel.
         */
        return _wheel.getColorScheme();
    }

    public void setColorScheme(ArrayList<Color> colors) {
        /*
		 * Set color scheme of the wheel.
         */
        _wheel.setColorScheme(colors);
    }

    public void addColor(Color color) {
        /*
		 * Add new color to the color scheme of the wheel.
         */
        _wheel.addColor(color);
    }

    public String getSelectedString() {
        /*
		 * Get current string selection for the wheel.
         */
        return _wheel.getSelectedString();
    }

    public boolean isSpinning() {
        /*
		 * Check if wheel is spinning.
         */
        return _wheel.isSpinning();
    }

    public void setShape(Wheel.Shape shape) {
        /*
		 * Set shape of the wheel.
         */
        _wheel.setShape(shape);
    }

    public double getTickWidth() {
        /*
		 * Get tick width.
         */
        return _tick.getTickWidth();
    }

    public void setTickWidth(int width) {
        /*
		 * Set tick width. Resets the bounds of both tick and wheel.
         */
        _tick.setTickWidth(width);
        this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    public double getTickHeight() {
        /*
		 * Get tick height.
         */
        return _tick.getTickHeight();
    }

    public void setTickHeight(int height) {
        /*
		 * Set tick height.
         */
        _tick.setTickHeight(height);
    }

    public Polygon getTickPolygon() {
        /*
		 * Get tick polygon.
         */
        return _tick.getPolygon();
    }

    public void setTickPolygon(Polygon polygon) {
        /*
		 * Set tick polygon.
         */
        _tick.setPolygon(polygon);
    }

    public void repaintTick() {
        if (_tick != null) {
            _tick.repaint();
        }
    }

    public Tick getTick() {
        return _tick;
    }

    public SelectionWheel(ArrayList<String> listOfStrings) throws Exception {
        /*
     * Constructor - initializes tick and wheel.
     */

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

    public void spinStartAsync(double speed, int direction, double deceleration) throws Exception {
        /*
		 * Start async wheel spin.
         */
        _wheel.spinStartAsync(speed, direction, deceleration);
    }

    public void spinStop() {
        /*
		 * Stop spinning.
         */
        _wheel.spinStop();
    }

    @Override
    public java.awt.Dimension getPreferredSize() {
        return new java.awt.Dimension(350, 350); // or whatever size you need
    }
}
