class CollisionException extends Exception {
    CollisionException(String a) {
        super(a);
    }
}

class Collision {
    String dir1, dir2;

    Collision(String a, String b) {
        dir1 = a;
        dir2 = b;
    }

    void checkCollision() {
        try {
            if(dir1.equals(dir2)) {
                System.out.println("The Vehicles are moving in same direction. ");
                System.out.println("Hence there is no collision");
            }

            else
                throw new CollisionException("The Vehicles are moving in opposite directions/perpendicular, so collision may occur");

        } catch(CollisionException e) {
            System.out.println(e.getClass());
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

public class Exceptions {
    public static void main(String[] args) {
        Collision o1 = new Collision("north", "north");
        Collision o2 = new Collision("south", "north");

        o1.checkCollision();
        System.out.println();
        o2.checkCollision();
    }
}
