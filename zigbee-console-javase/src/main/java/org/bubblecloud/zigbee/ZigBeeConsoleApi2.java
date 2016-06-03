package org.bubblecloud.zigbee;

/**
 * ZigBee Console API.
 *
 * @author Tommi S.E. Laukkanen
 */
public interface ZigBeeConsoleApi2 {

    /**
     * Executes console command.
     * @param command the console command
     * @return the command output
     */
    String execute(final String command);

}
