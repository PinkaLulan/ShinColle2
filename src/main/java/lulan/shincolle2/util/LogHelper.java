package lulan.shincolle2.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 說明：
 *   log輔助class
 *   
 * 版本：
 *   version  date        author        content
 *   -------  ----------  ------------  ------------------------------------------
 *   1.0      2022/03/20  PinkaLulan    class建立
 */
public class LogHelper
{
    
    private static final Logger log = LogManager.getLogger();
    
    private LogHelper()
    {
    }
    
    public static Logger getLog()
    {
        return log;
    }
    
    public static void info(Object... params)
    {
        log.info(params);
    }
    
    public static void warn(Object... params)
    {
        log.warn(params);
    }
    
    public static void error(Object... params)
    {
        log.error(params);
    }
    
    public static void debug(Object... params)
    {
        //		if (ConfigHandler.debugMode)
        log.debug(params);
    }
    
}
