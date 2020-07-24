package DaThuc;

public class TestDaThuc {

    public static void main(String[] args) {

        HangTu a = new HangTu(2,5);
        HangTu b = new HangTu(1,1);

        DaThuc d1 = new DaThuc(a);
        DaThuc d2= new DaThuc( new HangTu(1,1));

        d1.dt.add(a); d1.dt.add(a); d1.dt.add(a); d1.dt.add(a);
        d2.dt.add(new HangTu(6,2));

        d1.inDaThuc();
        d2.inDaThuc();


        System.out.println("da thuc d1 cong hang tu (1,1) : ");
        d1.addHangTu(b);
        d1.inDaThuc();

        System.out.println("Tong hai da thuc la: ");
        DaThuc d3 = d1.addDaThuc(d2);
        d3.inDaThuc();
    }
}
