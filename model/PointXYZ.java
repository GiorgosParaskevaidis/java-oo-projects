package gr.aueb.cf.ch12.model;

/**
 * The PointXYZ class represents <i>points</i> in a
 * three-dimensional space, where <b>x</b> and <b>y</b> and <b>z</b>
 * coordinates are consider integers. All o points could be represented
 * as instances.
 */

public class PointXYZ {
    private int x;
    private int y;
    private int z;

    /**
     * Initialized a newly created point at (0,0,0).
     */
    public PointXYZ() {
    }

    /**
     * Constracts a new point with specific coordinates.
     *
     * @param x      the axis x-coordinate.
     * @param y      the axis y-coordinate.
     * @param z      the axis z-coordinate.
     */
    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Get x coordinate
     * @return      the value of x-coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Get y coordinate
     * @return      the value of y-coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Get z coordinate
     * @return      the value of z-coordinate.
     */
    public int getZ() {
        return z;
    }

    /**
     * Set the x-coordinate
     *
     * @param x     the x-coordinate.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Set the y coordinate
     *
     * @param y     the y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Set the z coordinate
     *
     * @param z     the z-coordinate.
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     *  Returns the state of the three points
     *
     * @return      and x and y and z transforms into a string.
     */
    public String pointXYZToString() {
        return "(" + "x=" + x + ", y=" + y + ", z=" + z + ")";
    }
}
