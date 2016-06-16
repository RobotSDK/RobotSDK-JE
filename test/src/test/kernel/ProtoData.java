package test.kernel;

/**
 * Created by HMW on 2016/6/16.
 */
public class ProtoData {

    protected String msg;

    public ProtoData(String initMsg){
        msg=initMsg;
    }

    public  void showData(){
        System.out.println(msg);
    }

}
