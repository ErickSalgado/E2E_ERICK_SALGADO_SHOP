# Proyecto de Pruebas Automatizadas

Este proyecto contiene un conjunto de pruebas automatizadas diseñadas para comprobar el funcionamiento de una página de compras en línea.

## Tabla de Contenidos
1. [Prerrequisitos](#prerrequisitos)
2. [Instalación](#instalación)
3. [Ejecución de Pruebas](#ejecución-de-pruebas)
4. [Reportes](#reportes)
5. [Estructura del Proyecto](#estructura-del-proyecto)

## Prerrequisitos

Asegúrate de tener instalado lo siguiente en tu máquina local:

- Sistema Operativo: Windows 11
- IDE: IntelliJ IDEA 2024.1.3 o superior
- Gradle: versión 8.5 (configurado en la variable de entorno PATH)
- JDK: versión 17 (configurado en la variable de entorno JAVA_HOME)

## Instalación

1. Clona este repositorio:
   ```
   git clone https://github.com/ErickSalgado/E2E_ERICK_SALGADO_SHOP.git
   ```
2. Navega al directorio del proyecto:
   ```
   cd path/E2E_ERICK_SALGADO_SHOP
   ```
3. Ejecuta el siguiente comando para construir el proyecto:
   ```
   ./gradlew clean build
   ```

## Ejecución de Pruebas

Hay dos formas de ejecutar las pruebas:

### Usando la línea de comandos

Ejecuta el siguiente comando en la raíz del proyecto:

```
./gradlew clean build
```

### Usando la herramienta de Gradle en IntelliJ IDEA

1. Abre la ventana de herramientas de Gradle (generalmente en el lado derecho de la interfaz).
2. Navega hasta la tarea `RunnerTest`.
3. Haz doble clic en `RunnerTest` para iniciar la ejecución de las pruebas.

## Reportes

Después de la ejecución de las pruebas, se genera automáticamente un reporte detallado. Puedes encontrarlo en:

```
/build/reports/tests/test/index.html
```

Abre este archivo en tu navegador para ver los resultados de las pruebas, incluyendo estadísticas, duración y detalles de cada caso de prueba.

## Estructura del Proyecto

Se ha utilizado el patrón de diseño Screenplay para poder tener una correcta distribución de los elementos.