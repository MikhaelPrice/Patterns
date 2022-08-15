package Singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Log1...");
        ProgramLogger.getProgramLogger().addLogInfo("Log2...");
        ProgramLogger.getProgramLogger().addLogInfo("Log3...");

        ProgramLogger.getProgramLogger().showFile();
    }
}
