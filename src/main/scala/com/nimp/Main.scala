
import java.io._
import java.net._
import scala.io._

object Main {
  def main(args: Array[String]) = {

    // check if the user has passed the key
    if (args.length == 0) {
        println("You need to pass the key as an argument!")
        // exit the program
        System.exit(1)
    }
    val key = args(0)

    // set all the parameters
    val baseUrl = "http://api.weatherapi.com"
    val serviuce = "/v1/current.json"
    val keyword = "Paris"
    // construct the final url
    val url = baseUrl + serviuce + "?key=" + key + "&q=" + keyword

    // create a connection
    val conn = new URL(url).openConnection.asInstanceOf[HttpURLConnection]
    // set the request method
    conn.setRequestMethod("GET")
    // send data
    val inputStream = conn.getInputStream
    // read the response and transform it to a string
    val content = Source.fromInputStream(inputStream).mkString
    println(content)

    // close the connection
    inputStream.close()
  }
}