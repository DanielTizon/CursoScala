
  object Scala_1_Definicion_Variables {
  
  println("Hello World en Scala")                 //> Hello World en Scala

  /* 1. DEFINICION DE VARIABLES
   
  Scala tiene dos tipos de variables:
  
    - Variables inmutables (definidas por la palabra clave "val"): no se pueden modificar y se usan en programacion funcional.
    
    - Variables mutables (definidas por la variable clave "var"): son las variables que estamos acostumbrados a utilizar y que pueden
      modificarse sin problemas, y deberíamos evitar su uso.
    
  Otro rasgo distintivo de Scala es que usa inferencia de tipos para averiguar cual es el tipo correspondiente a nuestras variables,
  por tanto a la hora de definir una variable no necesitamos decir cual es su tipo. No obstante, si nos viesemos en la necesidad
  de describir explicitamente el tipo de una variable, podemos hacerlo como veremos en los siguientes ejemplos:
  
   */

  val x = 10                                      //> x  : Int = 10
  var y = 20                                      //> y  : Int = 20

  // ¿Qué pasaría si descomentamos la linea siguiente?
  //x = x + 10
  y = y + 30
  println("y = " + y)                             //> y = 50

  // En este ejemplo forzamos a que x_2 sea de tipo Double, ya que de otro
  // modo Scala inferiria un Int como en el caso de las variables "x" o "y"

  val x_2: Double = 10                            //> x_2  : Double = 10.0
  println("x_2 = " + x_2)                         //> x_2 = 10.0

  // PRACTICA 1: Crea una variable inmutable "z" que contenga el número 50 en formato Long, y una variable inmutable "z2" que contenga el número 10 en formato Int.
  // Después imprime el resultado de la suma de ambas variables.


}