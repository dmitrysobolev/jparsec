/*****************************************************************************
 * Copyright (C) Codehaus.org                                                *
 * ------------------------------------------------------------------------- *
 * Licensed under the Apache License, Version 2.0 (the "License");           *
 * you may not use this file except in compliance with the License.          *
 * You may obtain a copy of the License at                                   *
 *                                                                           *
 * http://www.apache.org/licenses/LICENSE-2.0                                *
 *                                                                           *
 * Unless required by applicable law or agreed to in writing, software       *
 * distributed under the License is distributed on an "AS IS" BASIS,         *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 * See the License for the specific language governing permissions and       *
 * limitations under the License.                                            *
 *****************************************************************************/

package org.codehaus.jparsec.error;

import org.codehaus.jparsec.util.ObjectTester;

import junit.framework.TestCase;

/**
 * Unit test for {@link Location}.
 * 
 * @author Ben Yu
 */
public class LocationTest extends TestCase {
  
  public void testToString() {
    assertEquals("line 1 column 2", new Location(1, 2).toString());
  }
  
  public void testEquals() {
    ObjectTester.assertEqual(new Location(1, 2), new Location(1, 2));
    ObjectTester.assertNotEqual(new Location(1, 2), new Location(2, 2), new Location(1, 1));
  }
}
