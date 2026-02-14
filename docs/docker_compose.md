# Docker Compose  
Docker Compose is a tool used to define and run multi-container Docker applications using a single YAML file (docker-compose.yml).  
You define everything once and run:  
```
docker compose up
```
## Why do we need Docker Compose?  
- Run multiple containers together (e.g., Flask + MySQL)  
- Manage networks & volumes automatically  
- One-command startup and shutdown  
- Perfect for local development & testing  

## Basic Docker compose file structure

```
version: "3.9"

services:
  app:
    image: nginx

volumes:
  my-volume:

networks:
  my-network:
```

## Key Docker Compose Concepts 
#### Services
```
Each container = one service

services:
  mysql:
  flask:
```

#### Volumes (persistent data)

```
volumes:
  mysql-data:


Mounted inside a container:

volumes:
  - mysql-data:/var/lib/mysql
```

#### Networks (auto-created)

```
All services can talk using service names

mysql → hostname: mysql


No need to expose ports internally.
```

#### depends_on
It ensures container startup order. Does NOT ensure the service is ready.
```
services:
  mysql:
    image: mysql:8

  flask:
    build: .
    depends_on:
      - mysql

“Start mysql container before flask container”
```

#### healthcheck

A healthcheck tells Docker how to determine whether a container is healthy.
Docker will mark container status as:  
- starting  
- healthy  
- unhealthy  

```
healthcheck:
      test: ["CMD", "mysqladmin", "ping", "-h", "localhost", "-uroot", "-proot"]
      interval: 10s
      timeout: 5s
      retries: 5
      start_period: 60s

```

depends_on + healthcheck (Best Practice) 

This ensures Flask starts only after MySQL is healthy.
```
version: "3.9"

services:
  mysql:
    image: mysql:8
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: testdb
    healthcheck:
      test: ["CMD", "mysqladmin", "ping", "-h", "localhost"]
      interval: 10s
      timeout: 5s
      retries: 5

  flask:
    build: .
    depends_on:
      mysql:
        condition: service_healthy

```
#### restart 
restart defines what Docker should do when a container stops or crashes.
``` restart: <policy> ```
```
Policy          Meaning
no	            Do not restart (default)
always	        Restart container if it stops
on-failure	    Restart only if exit code ≠ 0
on-failure:N	  Restart max N times
unless-stopped	Restart unless manually stopped
```

Examples 
```
services:
  app:
    image: nginx
    restart: always
```

## Most Important Docker Compose Commands 🚀

#### Start services
```
docker compose up
```

#### Detached mode:

```
docker compose up -d
```

#### Stop services
```
docker compose down
```

#### Remove volumes too:
```
docker compose down -v
```

#### View running services
```
docker compose ps
```

#### View logs
```
docker compose logs
docker compose logs flask
```

#### Rebuild images
```
docker compose up --build
```

#### Execute command inside container
```
docker compose exec mysql bash
```
