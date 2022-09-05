/**
 * Класс Main
 */
class Main {

    /**
    * Функция main
    */
    static function main() {
        var listOfInts = new List<Int>();
        for(i in 1...11) listOfInts.add(i);
        var listOfEvenInts = listOfInts.filter(function (e) return e % 2 == 0);
        var withSeparator : String = listOfEvenInts.join(" / ");

        Sys.println( withSeparator + " Hello team!");
    }
}
