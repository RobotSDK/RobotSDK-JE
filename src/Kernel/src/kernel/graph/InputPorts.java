package kernel.graph;

import kernel.proto.ProtoData;
import kernel.proto.ProtoParam;

import java.util.EventListener;
import java.util.EventObject;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;

class InputPort{

    public int portId;
    public BlockingQueue<ProtoData> portDataBuffer;
    public BlockingQueue<ProtoParam> portParamBuffer;

    public InputPort(int portId){
        this.portId=portId;
    }
}

class InputPortEvent extends EventObject{

    public InputPort inputPort;

    public InputPortEvent(Object source, InputPort inputPort) {
        super(source);
        this.inputPort=inputPort;
    }

}

interface InputPortListener extends EventListener{
    public void inputPortEvent(InputPortEvent event);
}

public class InputPorts implements InputPortListener{

    protected int portNum;
    protected Vector<InputPort> inputPorts=new Vector<>();

    public InputPorts(int portNum){
        this.portNum=portNum;
        inputPorts.setSize(portNum);
        for(int i=0;i<portNum;i++){
            inputPorts.set(i,new InputPort(i));
        }
    }

    @Override
    public void inputPortEvent(InputPortEvent event) {

    }
}
