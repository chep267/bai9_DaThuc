package dong_neee;

public class test_DaThuc {
    public static void main(String[] args) {
        hangtu a = new hangtu(2,5);
        hangtu b = new hangtu(1,1);

        dathuc d1 = new dathuc(a);
        dathuc d2= new dathuc( new hangtu(1,1));

        d1.dt.add(a); d1.dt.add(a); d1.dt.add(a); d1.dt.add(a);
        d2.dt.add(new hangtu(6,2));

        d1.inDaThuc();
        d2.inDaThuc();


        System.out.print("\nda thuc d1 cong hang tu (1,1) : ");
        d1.congHangTu(b);
        d1.inDaThuc();

        System.out.print("\nTong hai da thuc la: ");
        dathuc d3 = d1.cong2DaThuc(d2);
        d3.inDaThuc();
    }
}
