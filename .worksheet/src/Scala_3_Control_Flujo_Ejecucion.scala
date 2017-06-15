  object Scala_3_Control_Flujo_Ejecucion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(448); 
  /* 3. CONTROL DE FLUJO DE EJECUCION (WHILE, FOR, FOREACH, IF)
  
  En Scala existen varias formas de controlar el flujo de ejecución de nuestros programas, como los típicos "while", "for", "if", etc. No obstante, se desaconseja
  el uso de los "while" ya que requieren que se lleven a cabo modificaciones de variables, y por tanto iria en contra de un tipo de programacion funcional.
  
  */
  var i = 0;System.out.println("""i  : Int = """ + $show(i ));$skip(79); 

  while (i < 10) {
    if (i != 5) {
      println(i)
    }
    i = i + 1
  };$skip(355); 

  // En Scala se prefiere utilizar este tipo de bucles, que permiten trabajar sin variables modificables. Por otra parte, en los bucles de tipo "for" se pueden
  // añadir guardas (en el ejemplo siguiente "if i!= 5" sería una guarda), para especificar casos en los que no queremos que se entre en el bucle
  for (i <- 0 to 10 if i != 5) {
    println(i)

  };$skip(193); 

  // Scala permite recorrer listas usando un for con una sintaxis bastante sencilla, como podemos ver en el siguiente ejemplo:
  val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(35); 
  for (i <- list) {
    println(i)
  };$skip(246); 
  
  // Si queremos quedarnos con un valor de cada iteración de un for, podemos utilizar la palabra reservada "yield"
  
  val res = for (element <- list) yield {
  	if ((element%2) == 0) Tuple2(element,"PAR")
  	else Tuple2(element,"IMPAR")
  };System.out.println("""res  : List[(Int, String)] = """ + $show(res ));$skip(35); 
  println(res.mkString(" - "));$skip(159); 
  
  // Otra opcion para recorrer una lista en Scala es utilizar el método "foreach" que usa lambdas
  list.foreach(elemento_lista => println(elemento_lista));$skip(320); 

  


  // PRACTICA 3: Realiza una función que dada una lista de Strings, cuente los Strings que empiezan por "C" mayuscula o minuscula.
  // Utiliza la lista "list_practica" para comprobar el correcto funcionamiento de tu función
  val list_practica = List("casa", "Coche", "Avion", "Colegio", "configuracion", "Cono");System.out.println("""list_practica  : List[String] = """ + $show(list_practica ))}
  
  }
