#Escenario 1: En la pagina TuCarro automatizar con Selenium un escenario que verifique 
#             la cantidad de marcas de autos disponibles en un dropdown en la pagina principal.
#Escenario 2: En la pagina TuCarro automatizar con Selenium un escenario que verifique 
#             la cantidad de autos devueltos en una busqueda para cada una de esats cuatro marcas Ferrari, BMW, Mazda y Honda.


Feature: Automatizar pruebas en la pagina TuCarro

    Scenario: Verificar la cantidad de marcas de autos dispoinibles en TuCarro
        Given navego en la pagina principal de TuCarro
        When cierro la ventana emergente
        Then verifico la cantidad de marcas disponibles es 80