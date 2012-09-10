/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

 package org.mule.module.facebook.types;

import java.io.Serializable;
import java.util.List;

import com.restfb.Facebook;
import com.restfb.types.Comment;
 
public class CommentList implements Serializable
{
    
    private static final long serialVersionUID = 1L;
    
    @Facebook
    private List<Comment> data;

    public List<Comment> getData()
    {
        return data;
    }
    
    public void setData(List<Comment> data)
    {
        this.data = data;
    }
}

