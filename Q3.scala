object Question3{

    def main(args: Array[String]) = { 
        println(formatNames("Benny")()(toUpper));
        println(formatNames("Niroshan")(1)(toUpper));
        println(formatNames("Saman")()(toLower));
        println(formatNames("Kumara")(5)(toUpper));
    }  

    def toUpper(name:String):String = name.toUpperCase();
    def toLower(name:String):String = name.toLowerCase();
    
    def formatNames(name:String)( list: Int*)(function: String => String): String = {
        if (list.isEmpty){
            return function(name);
        }
 
        var x = "";
        var a=0;
        while(a<name.length()){
            if(list.contains(a)) x = x+ function(name.charAt(a).toString);
            else temp=temp+name.charAt(a).toString;
            a=a+1;
        }
        return x;
 
    }
}