package lang.print.gaps.task5;

public class TimeConvertor {
    public static void main(String[] args) {
        TimeConvertor tc = new TimeConvertor();
        tc.convert(20.5f);
    }
    public void convert(float minutes) {
        System.out.println((float) minutes*60);
    }
}
