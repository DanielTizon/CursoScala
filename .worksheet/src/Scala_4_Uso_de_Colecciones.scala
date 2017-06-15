  object Scala_4_Uso_de_Colecciones {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1084); 
  /* 4. USO DE COLECCIONES
  
  Una de las cosas en las que Scala realmente destaca es en la facilidad que ofrece para trabajar con colecciones.
  De hecho, las últimas versiones de Java han empezado a copiar gran parte de esta funcionalidad de Scala. Sólo
  veremos algunas de las colecciones más relevantes, puesto que sería imposible ver todas las colecciones disponibles,
  y lo importante es que consigamos tener una visión general de como funcionan las colecciones en Scala y los métodos
  que se utilizan más a menudo a la hora de trabajar con ellas.
  
  Es importante destacar que todas las colecciones de Scala, por defecto, son inmutables, aunque la mayoría de ellas
  también tienen una versión mutable.
  
  */
  
  // Las listas de Scala son similares a las LinkedList de Java, y estan optimizadas para obtener los primeros elementos y añadir pro el principio,
  // pero con la diferencia de que en Scala son inmutables, y no las podemos modificar, aunque podemos crear nuevas listas a partir de ellas.
  val list = List(5,10,15,20);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(115); 
  
  // Si queremos añadir un elemento al principio de la lista usamos el operador "::"
  val list_new = 0 :: list;System.out.println("""list_new  : List[Int] = """ + $show(list_new ));$skip(287); 
 
 // Si queremos añadir un elemento al final de la lista usamos el operador ":+", pero es aconsejable no utilizar esta operacion, ya que cuando
 // añadimos un elemento al final de la lista el tiempo que tarda será proporcional al tamaño de la lista
 
  val list_new_2 = list_new :+ 25;System.out.println("""list_new_2  : List[Int] = """ + $show(list_new_2 ));$skip(144); 
 
  // Y si queremos añadir los elementos de una lista a los elementos de otra usamos el operador ":::"
  val lista_final = list ::: list_new_2;System.out.println("""lista_final  : List[Int] = """ + $show(lista_final ));$skip(171); 
  
  // En Scala también podemos usar un Set, que al igual que en Java, no permite tener elementos repetidos
  val prueba_set = Set(1,2,3,2,2,2,2,5,4,3,3,6,2,1,6,7,2,2,4);System.out.println("""prueba_set  : scala.collection.immutable.Set[Int] = """ + $show(prueba_set ));$skip(120); 
  
  // Tambien podemos obtener un Set a partir de una lista con el comando "toSet"
  val set_final = lista_final.toSet;System.out.println("""set_final  : scala.collection.immutable.Set[Int] = """ + $show(set_final ));$skip(167); 
  
  // Para crear mapas en Scala podemos utilizar la siguiente nomenclatura
  val prueba_map  = Map("uno" -> 1, "dos" -> 2, "tres" -> 3, "cuatro" -> 4, "cinco" -> 5);System.out.println("""prueba_map  : scala.collection.immutable.Map[String,Int] = """ + $show(prueba_map ));$skip(303); val res$0 = 
                                                  
  // Cuando tratamos de obtener un elemento de un Map, obtendremos un objeto de tipo "Option", que puede ser o bien un None si el elemento
  // buscado no existe, o bien el valor para dicha key envuelto en un objeto tipo "Some"
  prueba_map.get("dos");System.out.println("""res0: Option[Int] = """ + $show(res$0));$skip(23); val res$1 = 
  prueba_map.get("10");System.out.println("""res1: Option[Int] = """ + $show(res$1));$skip(212); val res$2 = 
  
  // Para sacar el valor de un "Some", primero deberiamos comprobar si existe con el comando "isDefined", y luego utilizar el método "get"
  // para sacar el valor del "Some"
  prueba_map.get("dos").isDefined;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(35); val res$3 = 
  prueba_map.get("diez").isDefined;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(31); val res$4 = 
  
  prueba_map.get("dos").get;System.out.println("""res4: Int = """ + $show(res$4));$skip(95); val res$5 = 
  
  // Para añadir un elemento a un Map, usariamos el método "+"
  prueba_map + ("seis" -> 6);System.out.println("""res5: scala.collection.immutable.Map[String,Int] = """ + $show(res$5));$skip(463); 
  
  
  // Una de las operaciones más importantes que podemos realizar en una lista es filtrar sus elementos para quedarnos con los que nos interesen,
  // para ello utilizariamos el método "filter", el cual nos devolverá todos los elementos que cumplan la condición que especifiquemos.
  // Por ejemplo, si quisieramos quedarnos con los multiplos de 10, podriamos utilizar la siguiente operacion
  val lista_multiplos_10 = lista_final.filter(x => (x % 10) == 0);System.out.println("""lista_multiplos_10  : List[Int] = """ + $show(lista_multiplos_10 ));$skip(66); val res$6 = 
  
  // Obtener el primer elemento de la lista
  lista_final.head;System.out.println("""res6: Int = """ + $show(res$6));$skip(84); val res$7 = 
  
  // Obtener todos los elementos de la lista menos el primero
  lista_final.tail;System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(59); val res$8 = 
  
  // Obtener el tamaño de la lista
  lista_final.length;System.out.println("""res8: Int = """ + $show(res$8));$skip(48); val res$9 = 
  
  // Invertir la lista
  lista_final.reverse;System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(413); 
  
  // Otro método importante que nos permite transformar cada uno de los elementos de una lista, es el método "map". En el siguiente ejemplo,
  // transformamos cada elemento de tipo Int, en su literal correspondiente a partir de un Map, y si no le encontramos, entonces le asignariamos el literal "not_found"
  
  val prueba_map_inverse  = Map(1 -> "uno", 2 -> "dos", 3 -> "tres", 4 -> "cuatro", 5 -> "cinco");System.out.println("""prueba_map_inverse  : scala.collection.immutable.Map[Int,String] = """ + $show(prueba_map_inverse ));$skip(86); val res$10 = 
  prueba_set.map(elemento => prueba_map_inverse.get(elemento).getOrElse("not_found"));System.out.println("""res10: scala.collection.immutable.Set[String] = """ + $show(res$10));$skip(360); val res$11 = 

  // Si queremos reducir todos los elementos de una lista a uno sólo, por ejemplo sumando todos los elementos de dicha lista podriamos
  // utilizar el método "reduce" (aunque para este caso también podriamos usar directamente el comando "sum", pero es una forma sencilla
  // de ver el funcionamiento del método "reduce"
  lista_final.reduce( (x, y) => x+y);System.out.println("""res11: Int = """ + $show(res$11));$skip(116); 
  
  
  // Otro tipo de colección importante en Scala son las tuplas
  val tuplas = List((1,1,1), (2,2,2), (3,3,3));System.out.println("""tuplas  : List[(Int, Int, Int)] = """ + $show(tuplas ));$skip(374); 
  
  
  // PRACTICA 4: Dada la lista "lista_practica", transforma los valores de dicha lista a sus correspondientes numéricos, haciendo uso de un Map como
  // el que utilizamos anteriormente (prueba_map), y después multiplica todos los elementos de dicha lista
  
  val lista_practica = List("uno", "uno", "siete", "seis", "siete", "cinco", "tres", "dos", "cuatro", "dos");System.out.println("""lista_practica  : List[String] = """ + $show(lista_practica ))}
  
  }
  