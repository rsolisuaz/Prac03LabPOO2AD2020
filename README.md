# PRÁCTICA 3. USO DE INTELLIJ IDEA CON GITHUB Y PRUEBAS CON JUNIT.

## COPIA DEL REPOSITORIO REMOTO EN SU COMPUTADORA LOCAL

Como primer paso, será necesario crear una copia local del repositorio remoto creado en Github al aceptar la tarea. Para ello, es necesario hacer los siguientes pasos:
1. Entrar a la página cuyo URL les fue proporcionado al aceptar la tarea, en tal página dé click en el botón Code y copie el URL que aparece en el cuadro de texto de nombre **Clone with HTTPS** (comienza con *https://*)
2. Abre IntelliJ IDEA e indica que harás un clon local de tu repositorio:
   - Si no tienes ningún repositorio abierto selecciona la opción **Get From Version Control** de la Ventana de Bienvenida, o si tienes un proyecto abierto, puedes entrar al menú **VCS** y seleccionar la opción **Get From Version Control**
   - En el cuadro de diálogo que aparece, selecciona Git, pega el URL que copiaste en el paso 1 y pegalo en el cuadro de texto **URL**, da click en **Clone**
   
3. Clone el repositorio privado dando el comando `git clone URL practica02`
 (donde **URL** es el URL que copió en el paso 1)\
 Este comando creará dentro de la carpeta creada en el paso 2) una subcarpeta de nombre **practica02** donde estará una copia local del repositorio remoto.\
 Los comandos posteriores de git tendrán que darse desde tal carpeta, por tanto, cámbiate a la carpeta usando `cd practica02`


## MODIFICACIÓN DEL CÓDIGO PROPORCIONADO
Una vez que tengas el repositorio local, tu trabajo consiste en completar los métodos **suma**, **resta**, **mult**, **divide** y **eleva**  de la clase **CalculadoraSimple**, proporcionada como parte del proyecto que se creó en tu repositorio privado al aceptar esta tarea.

Tales métodos tendrán como trabajo realizar la operación matemática indicada por el nombre del método sobre los argumentos recibidos (**a** y **b**)  y regresar el resultado de tal operación. Para todos los métodos los valores de a y b pueden ser positivos o negativos o cero. En todos los metodos ambos argumentos **a** y **b** son double a excepción de eleva donde **a** es double y **b** es entero. Todos los métodos regresan un double.
En el caso de **divide** debe manejar correctamente la situación donde el segundo argumento **b** sea cero, en tal caso deberá generar una **ArithmethicException** que contenga el mensaje **No se puede dividir entre cero** (Es importante que el mensaje sea tal como se indica sin espacios de mas ni de menos ni cambios de mayusculas y minusculas. Note también que no tiene signos de puntuación.

En el código que se te proporciona como base, ya se encuentra implementada toda la lógica para leer las líneas de la entrada e imprimir el resultado que devuelven los métodos arriba mencionados por lo cual no debes preocuparte en escribir el código para hacer esa tarea. En la clase **PruebaCalculadora** se hace la lectura de líneas de entrada que están compuestas de dos datos (enteros o flotantes, es decir, con parte decimal) y un operador entre ellos que pueden ser **+** **-**, * **/** y **^** (siendo éste último el operador para elevar o exponenciación) y por cada línea válida imprime el resultado. En caso de teclear una línea invalida mostrara un mensaje indicándolo, al dar una línea vacía se termina el proceso de lectura.

Para ejecutar el programa selecciona **PruebaCalculadora** de la lista de Configuraciones y da click en **Run** (el triángulo verde en la parte superior)
## Ejemplo

En el siguiente ejemplo, las líneas en **negrita** representan lo que se teclea de entrada (terminada con una línea en blanco). Con letras en *itálico* se muestra la salida correspondiente. 

*El programa espera expresiones de 2 operandos (+,-,*,/,^), linea vacia para terminar:*
**6+3.2**
*9.2*
**7.8/2**
*3.9*
**6+-3**
*3.0*
**-2\*-8**
*16.0*
**2^4**
*16.0*
**uno+dos**
*Invalida*
**67/0**
*No se puede dividir entre cero*

*Gracias por usar esta calculadora.*



## CALIFICACIÓN
Cada uno de los métodos que debes implementar de la clase **CalculadoraSimple** aportan parte de la calificación:

1. **suma**, **resta**, **mult** aportan **18 puntos cada uno**
2. **divide** y **eleva** aportan **23 puntos cada uno**

Dando un **total de 100 puntos**. **SI SU PROGRAMA NO COMPILA OBTENDRÁ CERO PUNTOS**

Para ejecutar las pruebas de tu programa **CalculadoraSimpleTest** de la lista de Configuraciones y da click en **Run** (el triángulo verde en la parte superior), te mostrará el resultado de las pruebas y la calificación obtenida

**RECUERDA QUE SOLO DEBES HACER CAMBIOS EN LOS CINCO MÉTODOS MENCIONADOS, NO DEBES CAMBIAR NINGUNA OTRA PARTE DEL CÓDIGO (DE HECHO, DONDE TU DEBES ESCRIBIR CÓDIGO ESTA MARCADO CON UN COMENTARIO `//TODO` )** 

## NOTAS IMPORTANTES
1. Cada vez que completes un método ejecuta las pruebas para verificar que las pruebas del método completado son exitosas
2. Una vez vez que completes un método y verifiques que pasa las pruebas haz un Commit (debes en tu proyecto tener como mínimo 5 commits, uno por cada método) indicando con un texto la descripción de lo hecho en el commit
3. Después de haber hecho todos los commits que completan tu programa, súbelo al repositorio remoto dando `git push`
4. Cada vez que subas tu proyecto al repositorio privada con un push, se aplicarán automáticamente las pruebas sobre tu código para verificar si funciona correctamente. Recuerda que en la página de tu repositorio en la sección **Pull Requests**, se encuentra una subsección de nombre **Feedback**, donde podrás encontrar los resultados de las pruebas en la pestaña denominada **Check** (expandiendo la parte que dice **Run education/autograding@v1**), y cualquier comentario general que el profesor tenga sobre tu código en la pestaña **Conversation**. 
