package track.M01-understanding-java.T01-programming-languages-and-java.M02-introduction.M05-OOPS;

public class Books {
    private int pageNum;
    public void setData(int x){
        pageNum = x;
    }
    public void getData(){
        System.out.println(pageNum);
    }
}

public class BooksApp{
    public static void main(String[] args){
        Books b1=new Books();
        b.setData(100);
        b.getData();
    }
}
    