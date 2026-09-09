public class StringMethod {
    public static void main(java.lang.String[] args) {
        java.lang.String s1 = "Java";
        char arr[] = s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        java.lang.String res = new java.lang.String(arr);
        System.out.println(res);
    }
}
