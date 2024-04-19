package org.scaler.splitwiseapr23.command;

public interface Command {
    boolean matches(String input);
    void execute(String input);
}
