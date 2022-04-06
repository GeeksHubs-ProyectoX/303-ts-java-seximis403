<p align="center">
    <img src="https://github.com/GeeksHubsAcademy/2020-geekshubs-media/blob/master/image/logo.png" >	
</p>


    Considere el siguiente problema:

    Escriba un programa corto que permita calcular todos los movimientos posibles de la figura de 
	la reina en un tablero NxM de ajedrez.

	Ejemplo

	1x1 -> 0

    [1,1]
	R

	2x1 -> 2

	[1,1]  [1,2]
	R      #
	#      R
    
	2x2 -> 12

	[1,1]  [1,2]  [2,1]  [2,2]
	R#     ##     #R     ##
	##     R#     ##     #R

	
	Constantes
	
	N >= 1 && N <= 20
	M >= 1 && M <= 20

    En la carpeta 'src/main/java/es/geekshubs/academy/Reina.java' se encuentra el fichero con la definición de
    nuestro método vacío.
    En la carpeta 'src/test/java/es/geekshubs/academy/ReinaTest.java' se encuentra el fichero con la suite de test.

    El modus operandi de trabajo es el siguiente:
    
    Debes 'forkear' el proyecto a tu cuenta.
    Puedes hacer PR's ilimitadas e ir validando poco a poco la solución contra nuestro respositorio con CI.
    Puedes trabajar en local y subir la solución haciendo un PR a nuestro repositorio.
    Cuando se envíe la PR final, debes indicar el tiempo de dedicación y los intentos que has hecho.
    También puedes añadir un comentario para dar cualquier tipo de feedback.
    
    En caso de duda, revisa en el apartado de 'Referencias'.

    [INFO] -------------------------------------------------------
    [INFO]  T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running es.geekshubs.academy.ReinaTest
    [INFO] Tests run: 67, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.118 s - in es.geekshubs.academy.ReinaTest
    [INFO]
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 67, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  3.982 s
    [INFO] Finished at: 2021-05-21T11:00:51+02:00
    [INFO] ------------------------------------------------------------------------

    Process finished with exit code 0

## Referencias

* [Tutorial - Testing Automatizado](https://github.com/GeeksHubsAcademy/2020-js-vanilla-testing-FFFF/blob/master/README.md)
