package com.lulan.shincolle2.utility;

import org.apache.logging.log4j.Logger;

/**
 * 名稱：
 *   LogHelper
 *   
 * 說明：
 *   log輔助class
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 */
public class LogHelper
{
	
    private static Logger log;
    
    private LogHelper() {}
    
	public static void init(Logger paramLog)
	{
	    log = paramLog;
	}
	
	public static Logger getLog()
	{
	    return log;
	}
	
	public static void info(Object...params)
    {
        log.info(params);
    }
	
	public static void warn(Object...params)
    {
        log.warn(params);
    }
	
	public static void error(Object...params)
	{
	    log.error(params);
	}
	
	public static void debug(Object...params)
	{
//		if (ConfigHandler.debugMode) log.debug(params);
	}
	
}
