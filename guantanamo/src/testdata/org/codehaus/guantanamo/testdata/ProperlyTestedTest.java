/*****************************************************************************
 * Copyright (C) Guantanamo Organization. All rights reserved.               *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the LICENSE.txt file.                                                     *
 *                                                                           *
 * Original code by Aslak Hellesoy                                           *
 * Idea by Chris Stevenson                                                   *
 *****************************************************************************/
package org.codehaus.guantanamo.testdata;

import junit.framework.TestCase;

/**
 * @author Aslak Helles&oslash;y
 * @version $Revision$
 */
public class ProperlyTestedTest extends TestCase {
    private ProperlyTested properlyTested = new ProperlyTested();

    public void testShouldHaveSimpleIfsRemoved() {
        properlyTested.whatever();
    }
}
