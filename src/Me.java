import java.util.Arrays;

public class Me {
     Me [] mes = new Me[2];

    public Me[] getMes() {
        return mes;
    }

    public void setMes(Me[] mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return
                 Arrays.toString(mes) ;
    }
}
