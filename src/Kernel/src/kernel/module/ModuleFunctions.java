package kernel.module;

import kernel.proto.ProtoData;
import kernel.proto.ProtoParam;
import kernel.proto.ProtoVar;

import java.util.Vector;

/**
 * Created by alexanderhmw on 6/18/16.
 */
public interface ModuleFunctions {
    boolean moduleInitialize(final ProtoParam nodeParam, ProtoVar nodeVar);
    boolean moduleOpen(final ProtoParam nodeParam, ProtoVar nodeVar);
    boolean moduleClose(final ProtoParam nodeParam, ProtoVar nodeVar);
    boolean moduleMain(final ProtoParam nodeParam, ProtoVar nodeVar, Vector<ProtoData> outputData, final Vector<ProtoData>... inputDataArray);
}
