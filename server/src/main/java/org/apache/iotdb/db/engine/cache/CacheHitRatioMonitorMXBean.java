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

package org.apache.iotdb.db.engine.cache;

public interface CacheHitRatioMonitorMXBean {

  double getChunkHitRatio();

  long getChunkEvictionCount();

  long getChunkCacheMaxMemory();

  double getChunkCacheAverageLoadPenalty();

  long getChunkCacheAverageSize();

  double getTimeSeriesMetadataHitRatio();

  long getTimeSeriesMetadataCacheEvictionCount();

  long getTimeSeriesMetadataCacheMaxMemory();

  double getTimeSeriesCacheAverageLoadPenalty();

  long getTimeSeriesMetaDataCacheAverageSize();

  double getBloomFilterHitRatio();

  long getBloomFilterCacheEvictionCount();

  long getBloomFilterCacheMaxMemory();

  double getBloomFilterCacheAverageLoadPenalty();

  long getBloomFilterCacheAverageSize();

  long getTotalMemTableSize();

  double getFlushThershold();

  double getRejectThershold();

  int flushingMemTableNum();

  int totalMemTableNum();
}
