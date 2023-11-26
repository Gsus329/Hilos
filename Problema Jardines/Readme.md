Las secciones críticas son aquellas secciones de código que no pueden ejecutarse concurrentemente, pues en ellas se encuentran los recursos o información que comparten diferentes hilos,
y que por tanto pueden ser problemáticas.

Un ejemplo sencillo que ilustra lo que puede ocurrir cuando varios hilos actualizan una misma variable es el clásico "ejemplo de los jardines". 
En él, se pone de manifiesto el problema conocido como la "condición de carrera", que se produce cuando varios hilos acceden a la vez a un mismo recurso, 
por ejemplo a una variable, cambiando su valor y obteniendo de esta forma un valor no esperado de la misma.

En el ejemplo del "problema de los jardines", el recurso que comparten diferentes hilos es la variable contador cuenta. 
Las secciones de código donde se opera sobre esa variable son dos secciones críticas, los métodos incrementaCuenta() y decrementaCuenta(). 
