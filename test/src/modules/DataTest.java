package modules;

import test.kernel.ProtoData;

/**
 * Created by HMW on 2016/6/16.
 */
public class DataTest extends ProtoData {

    @Override
    public void showData() {
        System.out.println("Extended: "+msg);
    }

    public void showOtherData() {
        System.out.println("otherData");
    }
}
