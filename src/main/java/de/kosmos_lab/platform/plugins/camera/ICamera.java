package de.kosmos_lab.platform.plugins.camera;


import de.kosmos_lab.platform.plugins.camera.exceptions.VideoNotAvailableException;
import org.pf4j.ExtensionPoint;

import java.io.File;
import java.util.Calendar;

public interface ICamera extends ExtensionPoint {
    
    File getRecording(Calendar calStart, Calendar calEnd, long delta) throws VideoNotAvailableException;
    byte[] getSnapshot();
    
}
