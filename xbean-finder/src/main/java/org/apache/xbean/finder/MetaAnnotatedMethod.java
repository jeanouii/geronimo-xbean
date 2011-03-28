/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.xbean.finder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
* @version $Rev$ $Date$
*/
public class MetaAnnotatedMethod extends MetaAnnotatedObject<Method> implements AnnotatedMethod<Method> {

    public MetaAnnotatedMethod(Method method) {
        super(method, unroll(method.getDeclaringClass(), method));
    }

    @Override
    public Annotation[] getDeclaredAnnotations() {
        return target.getDeclaredAnnotations();
    }

    @Override
    public Annotation[][] getParameterAnnotations() {
        return target.getParameterAnnotations();
    }

    @Override
    public Class<?> getDeclaringClass() {
        return target.getDeclaringClass();
    }

    @Override
    public String getName() {
        return target.getName();
    }

    @Override
    public int getModifiers() {
        return target.getModifiers();
    }

    @Override
    public Class<?>[] getParameterTypes() {
        return target.getParameterTypes();
    }

    @Override
    public java.lang.reflect.Type[] getGenericParameterTypes() {
        return target.getGenericParameterTypes();
    }

    @Override
    public Class<?>[] getExceptionTypes() {
        return target.getExceptionTypes();
    }

    @Override
    public java.lang.reflect.Type[] getGenericExceptionTypes() {
        return target.getGenericExceptionTypes();
    }

    @Override
    public String toGenericString() {
        return target.toGenericString();
    }

    @Override
    public boolean isVarArgs() {
        return target.isVarArgs();
    }

    @Override
    public boolean isSynthetic() {
        return target.isSynthetic();
    }




}