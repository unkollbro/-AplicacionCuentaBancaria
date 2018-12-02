# -AplicacionCuentaBancaria

Ejercicio Aplicacion cuenta bancaria FINALIZADO

Diseñar y desarrollar una aplicación llamada AplicacionCuentaBancaria que trabaja con el CCC
(código de cuenta corriente) de una cuenta bancaria.
El proyecto constará de dos clases cada una de ellas en un archivo Java diferente:
 Clase CuentaBancaria, que contiene los atributos y métodos necesarios para la gestión
de una cuenta bancaria.
 Clase AplicacionCuentaBancaria, que contiene un método main que se encarga de
realizar las funciones de programa principal (creación de un objeto de la
clase CuentaBancaria, solicitud al usuario de los datos del titular y la cuenta, gestión de
un menú de opciones para poder manipular la cuenta, etc.).
Se trabajará con el siguiente menú de opciones:
1. Ver el número de cuenta completo (CCC- Código Cuenta Cliente).
2. Ver el titular de la cuenta.
3. Ver el código de la entidad.
4. Ver el código de la oficina.
5. Ver el número de la cuenta (solamente el número de cuenta, sin entidad, oficina ni
dígitos de control).
6. Ver los dígitos de control de la cuenta.
7. Realizar un ingreso. Habrá que solicitar por teclado la cantidad que se desea
ingresar.
8. Retirar efectivo. Habrá que solicitar por teclado la cantidad que se desea retirar.
9. Consultar saldo.
10. Salir de la aplicación.
Antes de que aparezca este menú, el programa tendrá que solicitar al usuario los siguientes
datos:
o Nombre del titular de la cuenta (con un máximo de caracteres).
o Código cuenta cliente (CCC) de la cuenta completo (entidad-oficina-dígitos de controlcuenta).
El programa deberá asegurarse que el CCC es válido mediante la comprobación de:
o El formato (cuatro dígitos de entidad, cuatro dígitos de oficina, dos dígitos de control y
diez dígitos de número de cuenta).
o Los dígitos de control son válidos.
Además del programa principal de la aplicación (clase con una función main), habrá que
escribir una clase CuentaBancaria que proporcione todas las herramientas necesarias para
trabajar con este tipo de información:
o Constructor (o constructores) adecuados.
o Almacenamiento del nombre del titular (atributos).
o Almacenamiento del código de cuenta (atributos).
o Almacenamiento del saldo actual (atributos).
o Gestión de ingresos y depósitos (métodos de interfaz pública).
o Obtención del saldo (métodos de interfaz pública)
o Obtención de información sobre la cuenta: número de la cuenta, entidad, oficina,
titular, etc. (métodos de interfaz pública).
o Aquellas herramientas auxiliares necesarias para poder trabajar cómodamente con el
objeto. Algunas de esas herramientas podrán ser públicos y otras quizá no.
Para trabajar con el número de cuenta debes utilizar el modelo de Código Cuenta
Cliente (CCC), que está formado por cuatro campos: entidad - sucursal - dígito de control -
número de cuenta.
La idea es que puedas introducir el código de cuenta completo y que la clase disponga de un
mecanismo para comprobar que ese código es válido. Si el código no es válido, se debería
generar una excepción (y por supuesto no almacenar ese código de cuenta). Para ello podrías
tener, por ejemplo, un método estático que permita validar códigos de cuenta.
En general, deberías incluir excepciones para controlar aquellos casos en los que el uso de un
método no sea posible (intentar sacar más dinero del que hay en el saldo, intentar introducir
un titular con más caracteres de los permitidos, intentar ingresar o retirar una cantidad
negativa, etc.).
El código fuente Java de esta clase debería incluir comentarios en cada atributo (o en cada
conjunto de atributos) y método (o en cada conjunto de métodos del mismo tipo) indicando su
utilidad. El programa principal también debería incluir algunos comentarios explicativos sobre
su funcionamiento y la utilización de objetos de la clase CuentaBancaria.
El proyecto deberá contener al menos dos archivos fuente Java:
o Programa principal (clase con método main: AplicacionCuentaBancaria.java).
o La clase CuentaBancaria (CuentaBancaria.java).
Ayuda importante:
o Puedes obtener información acerca del funcionamiento de la CCC y de cómo calcular
los dígitos de control del siguiente artículo de Wikipedia:
Wikipedia: Código Cuenta Cliente.
o Puedes generar cuentas bancarias válidas (o comprobarlas) para hacer pruebas en tu
programa desde el siguiente enlace:
Generador/validador de cuentas bancarias.
