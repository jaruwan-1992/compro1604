package th.ac.nu.nu.students.u54341604.compro.ch01;

public class AssignmentOperator {
    public static void main(String[] args) {
 int x, y, z;
 x = y = z = 1;
 System.out.println("x = " + x + ", y = " + y + ", z = " + z);
 //x = 1, y = 1, z = 1
 x = (y = (z = z + 1) + 1) + 1;
 System.out.println("x = " + x + ", y = " + y + ", z = " + z);
 //x = 4, y = 3, z = 2
 x = (y = 1) + (z = 1);
 System.out.println("x = " + x + ", y = " + y + ", z = " + z);
 //x = 2, y = 1, z = 1
  }
}
