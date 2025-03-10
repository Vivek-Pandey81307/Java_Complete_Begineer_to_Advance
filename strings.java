public class strings{
    public static void main(String[] args) {
        String name = "anuj";
        String randomm = "anuj";
        System.out.println("hashcode_name " + System.identityHashCode(name));
        System.out.println("hascode_randomm " + System.identityHashCode(randomm));
        System.out.println(Integer.toHexString(System.identityHashCode(name))== Integer.toHexString(System.identityHashCode(randomm)));
    }
}