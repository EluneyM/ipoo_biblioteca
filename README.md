✏️  Actividad: Desafío Integrador Gestión de Productos

En este paso, te enfrentas al desafío de desarrollar un sistema completo de gestión de productos para una tienda en línea. A través de las siguientes actividades, pondrás en práctica tus conocimientos:


 Estructura del sistema de Gestión de Productos

Creación de la clase "Producto": Representará los productos disponibles en tu tienda en línea. Cada producto tendrá atributos como nombre, precio, cantidad en stock y una descripción.

Definición de subclases de "Producto": Representarán diferentes categorías de productos, como "ProductoElectronico" y "ProductoRopa", cada una con atributos específicos relacionados con su categoría.

Implementación de la interfaz "Comprable": Definirá un método "calcularPrecio()" para calcular el precio total de un producto, considerando descuentos o impuestos aplicables.

Creación de la clase "Cliente": Los clientes podrán agregar productos al carrito de compras y gestionar la lista de productos deseados. Se deberá implementar una excepción personalizada para situaciones donde se intente comprar productos agotados.

Interacción con el Sistema de Gestión de Productos

Desarrollo del menú interactivo:

Opción 1: Agregar producto al carrito: Permite al usuario seleccionar un producto y agregarlo al carrito de compras, gestionando adecuadamente la cantidad de productos a agregar.

Opción 2: Ver el carrito: El usuario podrá visualizar los productos agregados al carrito, junto con la cantidad y el precio total de cada producto.

Opción 3: Realizar la compra: Calcula el costo total de los productos en el carrito, aplica descuentos o impuestos según corresponda y muestra el precio final de la compra.

Opción 4: Salir del sistema: Permite al usuario salir del sistema.

Sugerencia adicional:

Se puede incluir una opción "volver a comprar" en el menú, que mantenga en memoria el stock de productos afectado por la compra anterior.