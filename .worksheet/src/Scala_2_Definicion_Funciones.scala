  object Scala_2_Definicion_Funciones {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(673); 
  /* 2. DEFINICION DE FUNCIONES
  	
  En Scala podemos definir una funcion utilizando la palabra clave "def" seguida del nombre de la funcion, y entre parentesis los argumentos
  con sus tipos correspondientes, y el cuerpo de la función se escribe tras un signo de igual y encerrado en unas llaves.
  
  Algunas diferencias entre Scala y Java es que en Scala no es necesario poner la palabra "return" para devolver un resultado, y tampoco es
  necesario especificar el tipo de dato que devolvera la función, ya que éste puede ser inferido directamente por Scala.
  
  */

  def max(x: Int, y: Int) = {
    if (x > y) x
    else y
  };System.out.println("""max: (x: Int, y: Int)Int""");$skip(14); val res$0 = 

  max(5, 20);System.out.println("""res0: Int = """ + $show(res$0));$skip(256); 

  // Una funcion que no devuelve nada se considera que devuelve un tipo Unit (similar al void de Java). Por otra parte, no es necesario poner las llaves
  // si nuestra función consta de tan sólo una linea
  def mostrarMensaje(msg: String) = println(msg);System.out.println("""mostrarMensaje: (msg: String)Unit""");$skip(25); 
  mostrarMensaje("HOLA")}

  // PRACTICA 2: Crea una función que devuelva el resultado "exacto" de una división de dos números enteros.
	
	}
