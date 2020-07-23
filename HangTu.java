package dathuc;

class HangTu {
    
    int n; //so mu
    double hs; //hs

    HangTu(int a, double b) {
        n = a;
        hs = b;
    }

    //get,set:
    
    void setSoMu(int a) {
        n = a;
    }
    
    void setHeSo(double a) {
        hs = a;
    }
    
    int getSoMu(){
        return n;
    }
    
    double getHeSo() {
        return hs;
    }
}
