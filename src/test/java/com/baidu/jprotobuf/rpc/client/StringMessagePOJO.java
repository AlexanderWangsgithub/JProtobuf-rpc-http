/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.jprotobuf.rpc.client;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

/**
 *
 * @author xiemalin
 * @since 1.1.0
 */
public class StringMessagePOJO {

    @Protobuf(fieldType = FieldType.STRING, order = 1, required = true)
    private String list;

    /**
     * get the list
     * @return the list
     */
    public String getList() {
        return list;
    }

    /**
     * set list value to list
     * @param list the list to set
     */
    public void setList(String list) {
        this.list = list;
    }
    
    
}
