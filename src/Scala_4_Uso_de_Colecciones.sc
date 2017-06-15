  object Scala_4_Uso_de_Colecciones {
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
  val list = List(5,10,15,20)                     //> list  : List[Int] = List(5, 10, 15, 20)
  
  // Si queremos añadir un elemento al principio de la lista usamos el operador "::"
  val list_new = 0 :: list                        //> list_new  : List[Int] = List(0, 5, 10, 15, 20)
 
 // Si queremos añadir un elemento al final de la lista usamos el operador ":+", pero es aconsejable no utilizar esta operacion, ya que cuando
 // añadimos un elemento al final de la lista el tiempo que tarda será proporcional al tamaño de la lista
 
  val list_new_2 = list_new :+ 25                 //> list_new_2  : List[Int] = List(0, 5, 10, 15, 20, 25)
 
  // Y si queremos añadir los elementos de una lista a los elementos de otra usamos el operador ":::"
  val lista_final = list ::: list_new_2           //> lista_final  : List[Int] = List(5, 10, 15, 20, 0, 5, 10, 15, 20, 25)
  
  // En Scala también podemos usar un Set, que al igual que en Java, no permite tener elementos repetidos
  val prueba_set = Set(1,2,3,2,2,2,2,5,4,3,3,6,2,1,6,7,2,2,4)
                                                  //> prueba_set  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 7, 3, 4
                                                  //| )
  
  // Tambien podemos obtener un Set a partir de una lista con el comando "toSet"
  val set_final = lista_final.toSet               //> set_final  : scala.collection.immutable.Set[Int] = Set(0, 5, 10, 25, 20, 15
                                                  //| )
  
  // Para crear mapas en Scala podemos utilizar la siguiente nomenclatura
  val prueba_map  = Map("uno" -> 1, "dos" -> 2, "tres" -> 3, "cuatro" -> 4, "cinco" -> 5)
                                                  //> prueba_map  : scala.collection.immutable.Map[String,Int] = Map(dos -> 2, un
                                                  //| o -> 1, cinco -> 5, tres -> 3, cuatro -> 4)
                                                  
  // Cuando tratamos de obtener un elemento de un Map, obtendremos un objeto de tipo "Option", que puede ser o bien un None si el elemento
  // buscado no existe, o bien el valor para dicha key envuelto en un objeto tipo "Some"
  prueba_map.get("dos")                           //> res0: Option[Int] = Some(2)
  prueba_map.get("10")                            //> res1: Option[Int] = None
  
  // Para sacar el valor de un "Some", primero deberiamos comprobar si existe con el comando "isDefined", y luego utilizar el método "get"
  // para sacar el valor del "Some"
  prueba_map.get("dos").isDefined                 //> res2: Boolean = true
  prueba_map.get("diez").isDefined                //> res3: Boolean = false
  
  prueba_map.get("dos").get                       //> res4: Int = 2
  
  // Para añadir un elemento a un Map, usariamos el método "+"
  prueba_map + ("seis" -> 6)                      //> res5: scala.collection.immutable.Map[String,Int] = Map(dos -> 2, uno -> 1, 
                                                  //| cinco -> 5, tres -> 3, seis -> 6, cuatro -> 4)
  
  
  // Una de las operaciones más importantes que podemos realizar en una lista es filtrar sus elementos para quedarnos con los que nos interesen,
  // para ello utilizariamos el método "filter", el cual nos devolverá todos los elementos que cumplan la condición que especifiquemos.
  // Por ejemplo, si quisieramos quedarnos con los multiplos de 10, podriamos utilizar la siguiente operacion
  val lista_multiplos_10 = lista_final.filter(x => (x % 10) == 0)
                                                  //> lista_multiplos_10  : List[Int] = List(10, 20, 0, 10, 20)
  
  // Obtener el primer elemento de la lista
  lista_final.head                                //> res6: Int = 5
  
  // Obtener todos los elementos de la lista menos el primero
  lista_final.tail                                //> res7: List[Int] = List(10, 15, 20, 0, 5, 10, 15, 20, 25)
  
  // Obtener el tamaño de la lista
  lista_final.length                              //> res8: Int = 10
  
  // Invertir la lista
  lista_final.reverse                             //> res9: List[Int] = List(25, 20, 15, 10, 5, 0, 20, 15, 10, 5)
  
  // Otro método importante que nos permite transformar cada uno de los elementos de una lista, es el método "map". En el siguiente ejemplo,
  // transformamos cada elemento de tipo Int, en su literal correspondiente a partir de un Map, y si no le encontramos, entonces le asignariamos el literal "not_found"
  
  val prueba_map_inverse  = Map(1 -> "uno", 2 -> "dos", 3 -> "tres", 4 -> "cuatro", 5 -> "cinco")
                                                  //> prueba_map_inverse  : scala.collection.immutable.Map[Int,String] = Map(5 ->
                                                  //|  cinco, 1 -> uno, 2 -> dos, 3 -> tres, 4 -> cuatro)
  prueba_set.map(elemento => prueba_map_inverse.get(elemento).getOrElse("not_found"))
                                                  //> res10: scala.collection.immutable.Set[String] = Set(dos, uno, cinco, not_fo
                                                  //| und, tres, cuatro)

  // Si queremos reducir todos los elementos de una lista a uno sólo, por ejemplo sumando todos los elementos de dicha lista podriamos
  // utilizar el método "reduce" (aunque para este caso también podriamos usar directamente el comando "sum", pero es una forma sencilla
  // de ver el funcionamiento del método "reduce"
  lista_final.reduce( (x, y) => x+y)              //> res11: Int = 125
  
  
  // Otro tipo de colección importante en Scala son las tuplas
  val tuplas = List((1,1,1), (2,2,2), (3,3,3))    //> tuplas  : List[(Int, Int, Int)] = List((1,1,1), (2,2,2), (3,3,3))
  
  
  // PRACTICA 4: Dada la lista "lista_practica", transforma los valores de dicha lista a sus correspondientes numéricos, haciendo uso de un Map como
  // el que utilizamos anteriormente (prueba_map), y después multiplica todos los elementos de dicha lista
  
  val lista_practica = List("uno", "uno", "siete", "seis", "siete", "cinco", "tres", "dos", "cuatro", "dos")
                                                  //> lista_practica  : List[String] = List(uno, uno, siete, seis, siete, cinco, 
                                                  //| tres, dos, cuatro, dos)
  
  }
  