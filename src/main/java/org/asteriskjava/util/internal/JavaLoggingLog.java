/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.asteriskjava.util.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.asteriskjava.util.Log;

/**
 * Implementation of {@link Log} that maps to the <strong>Logger</strong>
 * of the java.util.logging package.<br>
 * Kindly donated by Sun's Steve Drach.
 * 
 * @author drach
 */
public class JavaLoggingLog implements Log
{
    /**
     * The underlying commons-logging Log object to use.
     */
    private Logger log;

    /**
     * Creates a new JavaLoggingLog obtained from java.util.logging for the
     * given class.
     * 
     * @param clazz the class to log for.
     */
    public JavaLoggingLog(Class clazz)
    {
        log = Logger.getLogger(clazz.getName());
    }

    public void debug(Object obj)
    {
        log.fine(obj.toString());
    }

    public void info(Object obj)
    {
        log.info(obj.toString());
    }

    public void warn(Object obj)
    {
        log.warning(obj.toString());
    }

    public void warn(Object obj, Throwable ex)
    {
        log.log(Level.WARNING, obj.toString(), ex);
    }

    public void error(Object obj)
    {
        log.severe(obj.toString());
    }

    public void error(Object obj, Throwable ex)
    {
        log.log(Level.SEVERE, obj.toString(), ex);
    }
}
