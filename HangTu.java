package DaThuc;

class HangTu {

    //1 hang tu gom co he so va so mu, vi du: 2x^2...
    int n; //so mu
    double hs; //he so

    //Ham tao 1 hang tu voi so mu va he so cho truoc
    HangTu(int a, double b) {
        n = a;
        hs = b;
    }

    //get,set:
    void setSoMu(int a){
        n = a;
    }

    void setHeSo(double a){
        hs = a;
    }

    int getSoMu(){
        return n;
    }

    double getHeSo() {
        return hs;
    }
}
