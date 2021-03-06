/*
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at http://www.netbeans.org/cddl.html
 * or http://www.netbeans.org/cddl.txt.
 *
 * When distributing Covered Code, include this CDDL Header Notice in each file
 * and include the License file at http://www.netbeans.org/cddl.txt.
 * If applicable, add the following below the CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * The Original Software is JSwat. The Initial Developer of the Original
 * Software is Nathan L. Fiedler. Portions created by Nathan L. Fiedler
 * are Copyright (C) 2006. All Rights Reserved.
 *
 * Contributor(s): Nathan L. Fiedler.
 *
 * $Id$
 */

package com.bluemarsh.jswat.core.watch;

import java.util.Iterator;

/**
 * A WatchManager maintains the watch expressions within the application.
 * Concrete implementations of this interface are acquired from the
 * <code>WatchProvider</code> class.
 *
 * @author Nathan Fiedler
 */
public interface WatchManager {

    /**
     * Adds the given watch to the watch list.
     *
     * @param  watch  watch to be added.
     */
    void addWatch(Watch watch);

    /**
     * Add an event listener to this manager object.
     *
     * @param  listener  new listener to add to notification list.
     */
    void addWatchListener(WatchListener listener);

    /**
     * Remove the given watch from the managed list.
     *
     * @param  watch  watch to be removed.
     */
    void removeWatch(Watch watch);

    /**
     * Remove an event listener from this manager object.
     *
     * @param  listener  listener to remove from notification list.
     */
    void removeWatchListener(WatchListener listener);

    /**
     * Iterates the managed watches.
     *
     * @return  a watch iterator.
     */
    Iterator<Watch> watchIterator();
}
