
public class shortener {
    public static void main(String[] args) {
        Codec codec = new Codec();
        String encode = codec.encode("https://leetcode.com/problems/design-tinyurl");
        String decoded = codec.decode(encode);

        System.out.println(encode);
        System.out.println(decoded);

    }
}