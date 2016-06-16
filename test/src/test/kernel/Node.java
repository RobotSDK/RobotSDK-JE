package test.kernel;

import modules.DataTest;
import modules.ModuleTest;

/**
 * Created by HMW on 2016/6/16.
 */
public class Node {

    public static void main(String[] args){
        ModuleTest module=new ModuleTest();
        DataTest data=new DataTest("Test");
        boolean flag = module.moduleInitialize(data);
        System.out.println(flag);
    }

}
