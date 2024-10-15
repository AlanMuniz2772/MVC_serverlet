<%-- 
    Document   : index
    Created on : 1 oct 2024, 13:14:32
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interfaz Usuario</title>
    </head>
    <body>
        <h2>Alumno: LUIS ALEJANDRO DE LA LUZ GRACIANO</h2>
    <form action="Controlador" method="POST">
        <fieldset>
            <legend>Elige una opción</legend>
            
            <!-- Campo para el primer valor -->
            <label for="valor1">Ingresa Valor 1:</label>
            <input type="text" id="valor1" name="valor1" placeholder="- Ingresa valor -" required><br><br>
            
            <!-- Campo para el segundo valor -->
            <label for="valor2">Ingresa Valor 2:</label>
            <input type="text" id="valor2" name="valor2" placeholder="- Ingresa valor -"><br><br>
            
            <!-- Selector para la acción -->
            <label for="accion">Acción:</label>
            <select id="accion" name="accion" required>
                <option value="Cronómetro">Cronómetro</option>
                <option value="Cinta Métrica">Cinta Métrica</option>
                <option value="Termómetro">Termómetro</option>
                <option value="Cobranza">Cobranza</option>
            </select><br><br>
            
            <!-- Botones de aceptar y borrar -->
            <button type="submit" name="accionBoton" value="Aceptar">Aceptar</button>
            <button type="reset" name="accionBoton" value="Borrar">Borrar</button>
        </fieldset>
    </form>
    </body>
</html>
