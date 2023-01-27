package com.nimp

class SimpleTest extends AnyFunSuite {
  test("fansi.Color.Red(\"Hello, world!\")") {
    val fancyStr = fansi.Color.Red("Hello, world!")
    assert(fancyStr == fansi.Color.Red("Hello, world!"))
  }
}