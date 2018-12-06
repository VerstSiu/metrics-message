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
 * Metrics config
 *
 * @author verstsiu created at 2018-12-06 18:23
 */
object MetricsConfig {
  /**
   * Returns current time (in milliseconds)
   */
  internal fun currentTimeMs(): Long {
    return System.currentTimeMillis()
  }

  /**
   * Metrics handler
   */
  var handler: MetricsHandler = DefaultMetricsHandler

  /**
   * Default metrics handler
   */
  private object DefaultMetricsHandler: MetricsHandler {
    override fun dispatchMetricsDelay(message: MetricsMessage, delay: Long) {
      println("message - $message, delay - $delay ms")
    }
  }
}