/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.iotdb.confignode.consensus.request.write.sync;

import org.apache.iotdb.commons.sync.PipeInfo;
import org.apache.iotdb.confignode.consensus.request.ConfigPhysicalPlan;
import org.apache.iotdb.confignode.consensus.request.ConfigPhysicalPlanType;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

// Deprecated, restored for upgrade
@Deprecated
public class PreCreatePipePlanV1 extends ConfigPhysicalPlan {

  private PipeInfo pipeInfo;

  public PreCreatePipePlanV1() {
    super(ConfigPhysicalPlanType.PreCreatePipeV1);
  }

  public PreCreatePipePlanV1(PipeInfo pipeInfo) {
    this();
    this.pipeInfo = pipeInfo;
  }

  public PipeInfo getPipeInfo() {
    return pipeInfo;
  }

  @Override
  protected void serializeImpl(DataOutputStream stream) throws IOException {
    stream.writeShort(getType().getPlanType());
    pipeInfo.serialize(stream);
  }

  @Override
  protected void deserializeImpl(ByteBuffer buffer) throws IOException {
    pipeInfo = PipeInfo.deserializePipeInfo(buffer);
  }
}
