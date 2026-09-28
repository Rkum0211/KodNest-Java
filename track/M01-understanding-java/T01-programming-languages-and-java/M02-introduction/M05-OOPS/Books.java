public class Books {
    private int pageNum;

    public void setData(int x) {
        pageNum = x;
    }

    public void getData() {
        System.out.println(pageNum);
    }
}

class BookApp {
    public static void main(String[] args) {
        Books b1 = new Books();
        b1.setData(100);
        b1.getData();
    }
}