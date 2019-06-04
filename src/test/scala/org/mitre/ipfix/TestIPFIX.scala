package org.mitre.ipfix

import org.junit.Test
import org.junit.AfterClass
import org.apache.daffodil.tdml.Runner

object TestIPFIX {

  val r = Runner("org/mitre/ipfix/", "ipfix.tdml")

  @AfterClass def shutDown {
    r.reset
  }
}

class TestIPFIX {
  import TestIPFIX._

  @Test def test_ipfix1(): Unit = { r.runOneTest("ipfix1") }
  @Test def test_ipfix2(): Unit = { r.runOneTest("ipfix2") }
  @Test def test_ipfix2u(): Unit = { r.runOneTest("ipfix2u") }
}
