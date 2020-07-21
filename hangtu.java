package dong_neee;

class hangtu {
    int n; //so mu
    double hs; //hs

    hangtu(int a, double b){
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
