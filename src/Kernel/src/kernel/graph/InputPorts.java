package kernel.graph;

import kernel.proto.ProtoData;
import kernel.proto.ProtoParam;

import java.util.concurrent.BlockingQueue;

/**
 * Created by alexanderhmw on 6/18/16.
 */
public class InputPorts extends Thread{

    protected class InputPort{
        public BlockingQueue<ProtoData> portDataBuffer;
        public BlockingQueue<ProtoParam> portParamBuffer;
    }

    protected int portNum;


    @Override
    public void run() {

    }

    public InputPorts(int portNum){
        this.portNum=portNum;
    }
}
