/*
 * Copyright (C) Baidu Inc. All rights reserved.
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

package com.baidu.titan.core.filters;

import com.baidu.titan.dex.node.DexAnnotationNode;
import com.baidu.titan.dex.node.DexFieldNode;
import com.baidu.titan.dex.node.DexMethodNode;
import com.baidu.titan.dex.visitor.DexClassNodeVisitor;

/**
 * @author zhangdi07@baidu.com
 * @since 2018/8/21
 */
public class DisableInterceptClassNodeVisitorFilter implements DexClassNodeVisitor {

    @Override
    public void visitClassAnnotation(DexAnnotationNode dan) {

    }

    @Override
    public void visitMethod(DexMethodNode dmn) {

    }

    @Override
    public void visitField(DexFieldNode dfn) {

    }

    @Override
    public void visitClassNodeEnd() {

    }
}
