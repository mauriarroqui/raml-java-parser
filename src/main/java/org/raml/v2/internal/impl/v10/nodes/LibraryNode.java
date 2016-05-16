/*
 * Copyright 2013 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.v2.internal.impl.v10.nodes;

import org.raml.v2.internal.framework.nodes.KeyValueNodeImpl;
import org.raml.v2.internal.framework.nodes.Node;
import org.raml.v2.internal.framework.nodes.StringNode;
import org.raml.v2.internal.impl.commons.nodes.ContextProviderNode;

import javax.annotation.Nonnull;

public class LibraryNode extends KeyValueNodeImpl implements ContextProviderNode
{

    public LibraryNode()
    {
    }

    public LibraryNode(LibraryNode node)
    {
        super(node);
    }

    public String getName()
    {
        final StringNode key = (StringNode) getKey();
        return key.getValue();
    }

    @Nonnull
    @Override
    public LibraryNode copy()
    {
        return new LibraryNode(this);
    }

    @Nonnull
    @Override
    public Node getContextNode()
    {
        return getValue();
    }
}
