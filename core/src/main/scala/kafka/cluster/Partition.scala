/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kafka.cluster

/**
 * Data structure that represents a topic partition. The leader maintains the AR, ISR, CUR, RAR
 * TODO: Commit queue to be added as part of KAFKA-46. Add AR, ISR, CUR, RAR state maintenance as part of KAFKA-302
 */
case class Partition(topic: String, val partId: Int, var leader: Option[Replica] = None,
                     assignedReplicas: Set[Replica] = Set.empty[Replica],
                     inSyncReplicas: Set[Replica] = Set.empty[Replica],
                     catchUpReplicas: Set[Replica] = Set.empty[Replica],
                     reassignedReplicas: Set[Replica] = Set.empty[Replica])
