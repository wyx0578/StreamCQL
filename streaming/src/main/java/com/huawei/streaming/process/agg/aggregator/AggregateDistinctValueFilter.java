/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.streaming.process.agg.aggregator;

/**
 * <Distinct Filter>
 * <功能详细描述>
 * 
 */
public class AggregateDistinctValueFilter extends AggregateDistinctValue
{
    
    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 3971189841795254263L;
    
    /**
     * <默认构造函数>
     *@param agg 内部聚合操作
     */
    public AggregateDistinctValueFilter(IAggregate agg)
    {
        super(agg);
    }
    
    /**
     * {@inheritDoc}
     */
    public IAggregate cloneAggregate()
    {
        IAggregate innerclone = ((IAggregateClone)getInner()).cloneAggregate();
        return new AggregateDistinctValueFilter(innerclone);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void enter(Object value, boolean filter)
    {
        if (!AggregateFilterUtil.checkFilter(filter))
        {
            return;
        }
        
        super.enter(value, filter);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void leave(Object value, boolean filter)
    {
        if (!AggregateFilterUtil.checkFilter(filter))
        {
            return;
        }
        
        super.leave(value, filter);
    }
}
