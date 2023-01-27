object Main {

    // retriev arguements from command line and print them

    def fancyStr(string: String) = fansi.Color.Red(string)
    def main(args: Array[String]): Unit = {
        // to print all arguments
        if (args.length > 0) {
            println("Arguments:")
            args.foreach(println)
        } else {
            println(fancyStr("You neeed to pass arguments to this program!"))
        }
        // to print a fancy string
        
    }
}
