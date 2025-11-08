package com.example.evaluacion2_30kt.explicacion

/**
 * ==================
 * Glosario del Tema
 * ==================
 *
 * Este archivo explica las variables y funciones principales utilizadas en el archivo `Theme.kt` de la aplicación.
 */

// ==========// Variables// ==========

/**
 * DarkColorScheme:
 * Es una variable que guarda la paleta de colores específica para el TEMA OSCURO de tu aplicación.
 * Define colores como el primario, secundario, fondo, etc., que se usarán cuando el modo oscuro esté activo.
 */

/**
 * LightColorScheme:
 * Similar a la anterior, pero esta variable guarda la paleta de colores para el TEMA CLARO.
 * Se usará cuando la aplicación no esté en modo oscuro.
 */


// ==========// Funciones// ==========

/**
 * darkColorScheme(...) y lightColorScheme(...):
 * Son funciones que te da Material Design 3 para CREAR las paletas de colores.
 * Dentro de ellas, asignas un color específico a un rol (por ejemplo, `primary = Purple40`).
 */

/**
 * @Composable fun EVALUACION2_30ktTheme(...):
 * Esta es la FUNCIÓN PRINCIPAL de tu tema. Es un "Composable" que envuelve toda tu aplicación
 * (o una parte de ella) para aplicarle un estilo consistente (colores y fuentes).
 */

/**
 * isSystemInDarkTheme():
 * Es una función que DETECTA si el sistema operativo del teléfono está en MODO OSCURO.
 * Se usa para que tu aplicación cambie de tema automáticamente junto con el teléfono.
 */
/** revisar los archivos despues de cada repaso, no es necesario memorizarlo
 */
/**
 * dynamicDarkColorScheme(...) y dynamicLightColorScheme(...):
 * Estas funciones son para el COLOR DINÁMICO (Material You) en Android 12 y superior.
 * Crean una paleta de colores automáticamente basándose en el fondo de pantalla del usuario.
 */

/**
 * SideEffect { ... }:
 * Es un tipo especial de Composable que se usa para ejecutar código que no está directamente relacionado con la UI,
 * como cambiar el color de la barra de estado del sistema. Se ejecuta después de que la interfaz se haya dibujado.
 */

/**
 * MaterialTheme(...):
 * Es el CORAZÓN DEL SISTEMA DE TEMAS en Jetpack Compose. Esta función toma el `colorScheme` (la paleta de colores),
 * `typography` (los estilos de texto) y los aplica a todos los elementos de la interfaz de usuario que contiene.
 */
/** AL final le pedi a la ia que me hiciera las carpetas ademas de mostrarme ejemplos de como funciona,
 * cada codigo o funcion, asi logre avanzar mas rapido y comprender mejor.
 */