package io.appium.java_client.ios;

import static io.appium.java_client.ios.IOSMobileCommandHelper.screenDetails;

import java.util.Map;

import io.appium.java_client.CommandExecutionHelper;
import io.appium.java_client.ExecutesMethod;

public interface HasScreenDetails extends ExecutesMethod {
    default Map<String, Object> getScreenDetails() {
        return CommandExecutionHelper.execute(this, screenDetails());
    }
}
