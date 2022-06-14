# tarea-depurando
La tarea consiste en depurar los códigos suministrados: Calculadora.java, Contador.java y Factorial.java. Dichas clases se ejecutan en sus respectivos TestClase.java. Localiza los errores y en caso de haberlos soluciónalos. Realizara las siguientes actividades en el depurador de Eclipse y adjunta pantallazos para demostrarlo:
1. Definido y activado el filtrado de depuración para que no entre en ninguna librería externa.
![alt](1.jpg)
![alt](2.jpg)

2. En el paquete factorial:
   1. Punto de ruptura en la entrada del main (method breakpoint/entry). Avanza de forma libre para entender el funcionamiento del código.
   ![alt](3.jpg)
   ![alt](4.jpg)

   2. Punto de ruptura en la salida del método Factorial.recursivo() (method breakpoint/exit). Avanzo con resume y muestro el estado de las variables del método.
   ![alt](5.jpg)
   ![alt](6.jpg)
   ![alt](7.jpg)
   ![alt](8.jpg)
   ![alt](9.jpg)
   ![alt](10.jpg)

   3. Punto de ruptura condicional en el método Factorial.recursivo() cuando número sea menor que 9 (method breakpoint/conditional). Avanzo con resume y muestro el estado de las variables del método. ¿Cuántas veces se activa?
   ![alt](11.jpg)
   Se activa 8 veces

   4. Pila de llamadas en la función recursiva cuando ésta es mayor
   ![alt](12.jpg)

   5. Dos puntos de observación en Factorial.iterativo: numero y resultado. Añade puntos de ruptura y muestra el cambio de los valores en distintos pantallazos
  ![alt](13.jpg)
  ![alt](14.jpg)
  ![alt](15.jpg)
  ![alt](16.jpg)
  ![alt](17.jpg)
  ![alt](18.jpg)
  ![alt](19.jpg)


3. En el paquete contador:
   1. En TestContador añado un punto de ruptura en cada pasada del for y visualizo el cambio de variables.
   ![alt](2c.jpg)
   ![alt](3c.jpg)
   ![alt](4c.jpg)
   ![alt](5c.jpg)
   ![alt](6c.jpg)
   ![alt](7c.jpg)
   
   2. En Contador añado un punto de ruptura para la excepción MaximoContadorException (Add Java Exception Breakpoint). Pantallazo de la vista Debug con la pila. 
   3. Código modificado para que la excepción sea capturada y se informe al usuario de forma correcta.
   ![alt](8c.jpg)

4. En el paquete calculadora:
   1. Pon un punto de ruptura cuando el divisor sea 0
   ![alt](2d.jpg)
   ![alt](3d.jpg)

   2. Añade un punto de ruptura cuando se lance la excepción java.lang.ArithmeticException. Captura la excepción para que muestre el mensaje "No se puede realizar la división por cero" 
   3. Modifica el main para que solicite ambos números desde teclado de forma iterativa(10 veces)
6. Vista de puntos de ruptura expandidos y agrupados por proyectos, unos habilitados y otros no
   ![alt](4d.jpg)
7. Vista de puntos de ruptura expandidos y agrupados por ficheros y tipos, todos anulados (Skip All Breakpoints)
   ![alt](5d.jpg)
