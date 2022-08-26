public class Program {
    public static void main(String[] args) {
        Camera camera1 = new Camera("Canon    ", 30, 20, true, new Lens(18,55));
        System.out.println(camera1.toString());
        Camera camera2 = new Camera("Panasonic", 22, 15, false, new Lens(12,43));
        System.out.println(camera2.toString());
        Lens lens = new Lens(25,60);
        camera2.setLens(lens);
        System.out.println(camera2.toString());

        System.out.println();
        System.out.println("Number of cameras: " + Camera.COUNTER);
        System.out.println("Number of lenses: "+Lens.COUNTER);
    }

}
