docker network create two-tier -d bridge
docker network ls
docker network inspect two-tier

docker volume create mysql-data
docker volume ls
docker inspect mysql-data



docker run -d --name mysql --network two-tier -v mysql-data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DB=thoughts mysql
docker exec -it <mysql_container_od> bash
bash >> mysql -u root -p
show databases;
create database thoughts
use thoughts;
select * from messgaes

docker run -d -p 5000:5000 --name flask-app --network two-tier -e MYSQL_HOST=mysql -e MYSQL_USER=root -e MYSQL_PASSWORD=root -e MYSQL_DB=thoughts two-tier

add the port 5000 in sg of ec2 instance, run it on browser http://54.82.103.121:5000/

