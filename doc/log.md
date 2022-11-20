16-nov: Problemas para ejecutar el juego en MacOS.
	Mensaje de error: 
"Caused by: java.lang.IllegalStateException: GLFW windows may 
only be created on the main thread and that thread must be the first thread in the process. Please run the JVM with 
-XstartOnFirstThread. For offscreen rendering, make sure another window toolkit (e.g. AWT or JavaFX) is initialized before GLFW."
	Solución: 
Se resolvió haciendo clic en Menú - Ejecutar -> Editar configuraciones... -> Menú desplegable Modificar opciones -> Agregar 
opciones de VM -> y luego agregar el parámetro -XstartOnFirstThread al cuadro de texto junto a las opciones de VM.
