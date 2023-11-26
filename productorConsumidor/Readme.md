# Ejemplo Productor-Consumidor
Se definen 3 clases:
* Cola: que será el objeto compartido entre el productor y el consumidor
* Productor: produce números y los coloca en una cola
* Consumidor: consumen los números producidos por el productor
El recurso a compartir es la cola con los números
# Explicación
El productor genera números de 0 a 5 en un bucle for y los pone en el objeto Cola mediante el método ** put() **, después se visualiza y se hace una pausa con sleep(), durante este tiempo el hilo está en estado ** Not Runnable **.

El consumidor es similar a la clase productor, solo que en lugar de poner un número en cola en el objeto Cola lo recoge con el método ** get() **. En este caso 
no se ha puesto pausa para que sea más rápido que el productor

La clase Cola define dos atributos y dos métodos número para guardar el número, y disponible para indicar si hay o no un número disponible. 
El método ** put() ** guarda un número en el atributo número y hace que esté disponible en la cola para que sea consumido (cola llena)

El método ** get() ** devuelve el número entero de la cola si está disponible (disponible=true) y antes pone false indicando cola vacía; si el número no está en la cola (disponible=false) devuelve -1.

El main crea una cola, un productor y un consumidor y lo inicia. Si ejecutamos vemos que el consumidor es más rápido que el productor y no consume todos los números.

# Cómo solucinarlo

Debemos poner los métodos put y get como synchronized
Hay que mantener una coordinación entre consumidor y productor de forma que cuando el productor ponga un número en la cola, este avise al consumidor, y al revés, cuando el consumidor recoja un número le diga al productor que la cola está vacía.
A su vez, el consumidor deberá esperar hasta que la cola se llene y el productor esperará nuevamente a que la cola esté vacía para poner otro número.

Para mantener esta coordinación usamos los métodos *** wait(), notify() y notifyAll() ***

## Método get()
Tiene que esperar a que la cola se llene, esto se realiza en un bucle while-> mientras la cola esté vacía, espero (wait()).
Se sale del bucle cuando llega un valor, se vuelve a poner cola vacía de nuevo y se notifica a los hilos (notify o notifyAll

## Método put()
Tiene que esperar a que la cola se vacie  para poner el valor, entonces espera (wait) mientras haya un valor en la cola (while(disponible)).
Cuando la cola se vacía, entonces se sale del bucle, se asigna el valor a la cola y se vuelve a poner que la cola está llena, notificando a los hilos (notify o notifyAll)
