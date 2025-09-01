package java_advanced_01.teamMissionV1;

import java.io.IOException;
import java.io.Serializable;
import java.util.Set;


public interface SetOutput {

  void outputObject(Set<? extends Serializable> studentInfo, String fileName) throws IOException;
}
