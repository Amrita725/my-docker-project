# Docker Network

Containers run isolated from the host system and need a way to communicate with each other and with the host system. A Docker network is a way for Docker containers to communicate with each other and with the outside world, in an isolated and controlled manner

## Types of Docker networks  
```
Network type	             Use case  

bridge                 Default, single-host container communication  
host                   Container shares host network  
none                   No networking  
overlay                Multi-host (Docker Swarm)  
macvlan                Container gets its own IP  
```  

## Basic Docker network commands

```
docker network ls
docker network create my-network
docker network inspect my-network
docker network rm my-network
```

## Run containers on network
```
docker run -d --name web --network my-network nginx
docker run -d --name api --network my-network httpd

```

