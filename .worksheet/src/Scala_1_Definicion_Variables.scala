
  object Scala_1_Definicion_Variables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  
  println("Hello World en Scala");$skip(807); 

  /* 1. DEFINICION DE VARIABLES
   
  Scala tiene dos tipos de variables:
  
    - Variables inmutables (definidas por la palabra clave "val"): no se pueden modificar y se usan en programacion funcional.
    
    - Variables mutables (definidas por la variable clave "var"): son las variables que estamos acostumbrados a utilizar y que pueden
      modificarse sin problemas, y deberíamos evitar su uso.
    
  Otro rasgo distintivo de Scala es que usa inferencia de tipos para averiguar cual es el tipo correspondiente a nuestras variables,
  por tanto a la hora de definir una variable no necesitamos decir cual es su tipo. No obstante, si nos viesemos en la necesidad
  de describir explicitamente el tipo de una variable, podemos hacerlo como veremos en los siguientes ejemplos:
  
   */

  val x = 10;System.out.println("""x  : Int = """ + $show(x ));$skip(13); 
  var y = 20;System.out.println("""y  : Int = """ + $show(y ));$skip(84); 

  // ¿Qué pasaría si descomentamos la linea siguiente?
  //x = x + 10
  y = y + 30;$skip(22); 
  println("y = " + y);$skip(176); 

  // En este ejemplo forzamos a que x_2 sea de tipo Double, ya que de otro
  // modo Scala inferiria un Int como en el caso de las variables "x" o "y"

  val x_2: Double = 10;System.out.println("""x_2  : Double = """ + $show(x_2 ));$skip(26); 
  println("x_2 = " + x_2)}

  // PRACTICA 1: Crea una variable inmutable "z" que contenga el número 50 en formato Long, y una variable inmutable "z2" que contenga el número 10 en formato Int.
  // Después imprime el resultado de la suma de ambas variables.


}
