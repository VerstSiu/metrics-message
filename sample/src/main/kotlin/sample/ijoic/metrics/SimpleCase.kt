package sample.ijoic.metrics

import com.ijoic.metrics.MetricsConfig
import com.ijoic.metrics.MetricsMessage
import com.ijoic.metrics.statReceived
import com.ijoic.metrics.statSend

fun main() {
  MetricsConfig.traceEnabled = true

  val message = MetricsMessage()

  Thread.sleep(1000)
  message.statReceived()

  message.statSend()
  Thread.sleep(2000)
  message.statReceived()
}