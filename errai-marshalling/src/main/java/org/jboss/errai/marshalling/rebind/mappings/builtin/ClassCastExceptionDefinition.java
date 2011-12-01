/*
 * Copyright 2011 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.marshalling.rebind.mappings.builtin;

import org.jboss.errai.marshalling.rebind.api.CustomMapping;
import org.jboss.errai.marshalling.rebind.api.model.MappingDefinition;
import org.jboss.errai.marshalling.rebind.api.model.impl.SimpleConstructorMapping;

/**
 * @author Mike Brock
 */
@CustomMapping
public class ClassCastExceptionDefinition extends MappingDefinition {
  public ClassCastExceptionDefinition() {
    super(ClassCastException.class);

    SimpleConstructorMapping simpleConstructorMapping = new SimpleConstructorMapping();
    simpleConstructorMapping.mapParmToIndex("message", 0, String.class);

    setConstructorMapping(simpleConstructorMapping);
  }
}
