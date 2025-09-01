package java_advanced_01.teamMissionV1;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;


public interface MapOutput {

    void outputObject(Map<String, ? extends Serializable> studentInfo, String fileName)
        throws IOException;
}
