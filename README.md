# DOSW_ParcialT1_KevinSeguraVelandia
Parcial Dosw KevinSegura

# 1. Realice el diagrama de contexto con las generalidades de su sistema.
El diagrama de contexto es el siguiente teniedmo en cuenta las pautas especificadas
![Diagrama de contexto](//DOSW_ParcialT1_KevinSegura/docs/images/DiagramaContexto.png)


# 2. Identifique 2 patrones de diseño que puedan aplicarse al caso de estudio especificando por cada uno:.
## a. Nombre del Patrón
- el primer patron de diseño es Factory Method
- segundo patron de diseño es Observer


## b. Tipo de patrón (creacional, estructural o de comportamiento).
- Factory Method es un patron creacional
- Observer es un patron de comportamiento

## c. Justificación de la decisión.
- Elegi Factory Method para la creacion de dlos diferentes tipos de eventos ya que nos proporcina una interfaz para crear objetos de una superclase teniendo sus propios cambios y alteraciones asi como lo son: conferencia,Taller y Hackathon
- Elegy Observer para el manejo de las notificaciones de nuestro sistema ya que nos proporciona un mecanismo de suscripcion para notificar a distintos objetos en este caso:Profesores,Estudiantes y Administrativos

# 3.Identifique 5 requerimientos del sistema y clasifíquelos en funcionales (3) y no funcionales (2). Garantiza que al menos un requerimiento funcional seleccionado utilice un patrón identificado.
## Requerimientos Funcionales:
- Creación de eventos (utiliza el patron de diseño Factory Method )
- Inscripción de asistentes
- Notificación de cambios a los inscritos (utiliza el patron de diseño observer)


## Requerimientos no Funcionales


# 4.Del listado anterior, seleccione los 2 requerimientos funcionales más importantes del sistema y desarrolle un diagrama de casos de uso con su respectiva historia de usuario. Garantiza que al menos un requerimiento funcional seleccionado utilice un patrón identificado.
## Creacion Eventos (utiliza Factory Method)
![CasoDeUsoCreacionEvento](//DOSW_ParcialT1_KevinSegura/docs/images/CasoDeUso1.png)

## Notificacion de Cambios (utiliza Observer)
![CasoDeUsoNotificar](//DOSW_ParcialT1_KevinSegura/docs/images/CasoDeUso2.png)

# 5. Especifique los 2 requerimientos funcionales seleccionados en el punto anterior (Ver plantilla). (Añadir los documentos al repositorio, en la carpeta de requerimientos).
- El desrrollo de este punto esta en requirements.md
# 6. Seleccione un requerimiento asociado al patrón y realice la descomposición de tareas asociadas: Épica - Historia de Usuario - Al menos 3 tareas.

# 7.  Realice un diagrama de clases que permita entender su solución Mencione, ¿cuáles principios SOLID está aplicando? ¿Y por qué?

![DiagramaDeClases](//DOSW_ParcialT1_KevinSegura/docs/images/DiagramaDeClases.png)

- S Single responsability ya que cada clase esta cumpliendo con una unica reesposbilidad
- O open/closed debido a que la creacion de cada evento esta regulada por el patro factory y en caso de extension se puede hacer de manera mas facil


