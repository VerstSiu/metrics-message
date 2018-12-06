package sample.ijoic.metrics

import com.ijoic.metrics.BaseMetricsMessage
import com.ijoic.metrics.traceDelay

fun main() {
  val message = BaseMetricsMessage()

  Thread.sleep(1000)

  message.traceDelay()
}