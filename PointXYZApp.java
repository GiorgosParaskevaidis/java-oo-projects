package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.PointXYZ;

public class PointXYZApp {

    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ();
        PointXYZ p2 = new PointXYZ(10, 5, 3);
        PointXYZ p3 = new PointXYZ();

        p3.setX(8);
        p3.setY(6);
        p3.setZ(7);

        System.out.println(p1.pointXYZToString());
        System.out.println(p2.pointXYZToString());
        System.out.println(p3.pointXYZToString());
    }
}
