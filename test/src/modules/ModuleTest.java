package modules;

import test.kernel.ProtoData;
import test.kernel.ProtoModule;

/**
 * Created by HMW on 2016/6/16.
 */

public class ModuleTest implements ProtoModule{

    public DataTest data;

    @Override
    public boolean moduleInitialize(ProtoData paramData) {
        data=(DataTest)paramData;
        data.showData();
        data.showOtherData();
        return true;
    }

    public static void main(String[] args){
        ModuleTest module=new ModuleTest();
        DataTest data=new DataTest();
        boolean flag = module.moduleInitialize(data);
        System.out.println(flag);
    }
}
