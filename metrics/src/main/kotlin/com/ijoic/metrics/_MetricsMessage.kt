/*
 *
 *  Copyright(c) 2018 VerstSiu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.ijoic.metrics

/**
 * Trace status send of current messages
 *
 * @author verstsiu created at 2018-12-06 21:02
 */
fun <T: MetricsMessage> T.statSend(): T {
  val message = this

  with(MetricsConfig) {
    if (traceEnabled) {
      message.lastMsgSendTime = currentTimeMs()
    }
  }
  return this
}

/**
 * Trace status received of current messages
 *
 * @author verstsiu created at 2018-12-06 18:30
 */
fun <T: MetricsMessage> T.statReceived(): T {
  val message = this

  with(MetricsConfig) {
    if (traceEnabled) {
      val delay = currentTimeMs() - message.lastMsgSendTime
      handler.dispatchStatReceived(message, delay)
    }
  }
  return this
}