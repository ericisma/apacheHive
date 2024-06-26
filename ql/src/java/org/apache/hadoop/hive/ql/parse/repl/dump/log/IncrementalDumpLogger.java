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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.ql.parse.repl.dump.log;

import org.apache.hadoop.hive.ql.parse.repl.dump.log.state.IncrementalDumpBegin;
import org.apache.hadoop.hive.ql.parse.repl.dump.log.state.IncrementalDumpEnd;
import org.apache.hadoop.hive.ql.parse.repl.dump.log.state.IncrementalDumpEvent;
import org.apache.hadoop.hive.ql.parse.repl.ReplLogger;
import org.apache.hadoop.hive.ql.parse.repl.ReplState.LogTag;

/**
 * IncrementalDumpLogger.
 *
 * ReplLogger for incremental dump.
 **/
public class IncrementalDumpLogger extends ReplLogger<String> {
  private String dbName;
  private String dumpDir;
  private long estimatedNumEvents;
  private long eventSeqNo;
  private Long fromEventId;
  private Long toEventId;
  private int maxEvents;

  public IncrementalDumpLogger(String dbName, String dumpDir, long estimatedNumEvents,
                               Long fromEventId, Long toEventId, int maxEvents) {
    this.dbName = dbName;
    this.dumpDir = dumpDir;
    this.estimatedNumEvents = estimatedNumEvents;
    this.eventSeqNo = 0;
    this.fromEventId = fromEventId;
    this.toEventId = toEventId;
    this.maxEvents = maxEvents;
  }

  @Override
  public void startLog() {
    (new IncrementalDumpBegin(dbName, estimatedNumEvents, fromEventId, toEventId,
            Long.valueOf(maxEvents))).log(LogTag.START);
  }

  @Override
  public void eventLog(String eventId, String eventType) {
    eventSeqNo++;
    (new IncrementalDumpEvent(dbName, eventId, eventType, eventSeqNo, estimatedNumEvents))
            .log(LogTag.EVENT_DUMP);
  }

  @Override
  public void endLog(String lastReplId) {
    (new IncrementalDumpEnd(dbName, eventSeqNo, dumpDir, lastReplId)).log(LogTag.END);
  }
}
