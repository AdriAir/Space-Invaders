1. Abrir terminal en repositorio
2. (master) git pull origin master
3. (master) git checkout MiRamaPersonal
4. (MiRamaPersonal) git add .
5. (MiRamaPersonal) git commit -m "Comentario"
6. (MiRamaPersonal) git pull origin MiRamaPersonal_GitHub
7. (MiRamaPersonal) git status

//Si en GIT STATUS HAY CONFLICTOS, CONTACTAR A SCRUM MASTER O RESPONABLE
//En caso contario, continuar:

8. (MiRamaPersonal) git checkout master
9. (master) git merge MiRamaPersonal
10. (master) git status

//Si en GIT STATUS HAY CONFLICTOS, CONTACTAR A SCRUM MASTER O RESPONABLE
//En caso contario, continuar:

11. (master) git push origin MiRamaPersonal_Github

/*
El Scrum Master o propietario del repositorio se encargará de revisar el código en la rama y unirlo a master
*/
//En caso de querer subirlo directamente a master:

12. (master) git push origin master
