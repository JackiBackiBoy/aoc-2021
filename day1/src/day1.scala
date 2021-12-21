import scala.io.Source
import java.io.File

def countDepthIncrease(depthData: Vector[Int]): Int =
  var incrementCounter: Int = 0
  var lastDepth: Int = depthData(0).toInt

  for (i <- 1 until depthData.length)
    if (depthData(i) > lastDepth) then incrementCounter += 1
    lastDepth = depthData(i)

  incrementCounter

def countDepthSumIncrease(depthData: Vector[Int]): Int =
  var incrementCounter: Int = 0
  var lastDepthSum = depthData.slice(0, 3).sum

  for (i <- 1 until depthData.length)
    if (depthData.slice(i, i + 3).sum > lastDepthSum) then incrementCounter += 1
    lastDepthSum = depthData.slice(i, i + 3).sum

  incrementCounter


def day1(): Unit =
  // Load input file
  if (File("day1/depthData.txt").isFile)
    val depthData: Vector[Int] = Source.fromFile("day1/depthData.txt").getLines.toVector.map(_.toInt)

    println(s"Number of times depth increased: ${countDepthIncrease(depthData)}")
    println(s"Number of times depth-sum increased: ${countDepthSumIncrease(depthData)}")