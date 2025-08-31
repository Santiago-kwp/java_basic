package java_advanced_01.teamMissionV1;

public interface Printable extends Output {

    default void printUsage() {
    }

    void printResult();
}
