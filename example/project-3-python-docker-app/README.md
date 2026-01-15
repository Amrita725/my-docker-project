```md
## Java Docker Application

This project demonstrates containerizing a simple Flask web application using Docker and deploying it on an AWS EC2 instance. It also covers real-world debugging related to container networking, AWS security groups, and application logs.

## Concept Covered
- Lightweight image using slim base and no pip cache
- Application exposed on port 80
- ENTRYPOINT -- defines the main executable of a Docker container.
- AWS security groups
- Docker logs

## Build Image
docker build -t flask-docker-app .

## Run Image
docker run -d -p 80:80 flask-docker-app

## Docker Logs
docker logs <container_id> --- Used to inspect application output and runtime behavior.
docker attach <container_id> --- Attach to Running Container

## Learnings
- Docker port mapping must align with cloud firewall rules  
- EC2 Security Groups are critical for container accessibility  
- --no-cache-dir helps reduce image size  
- docker logs is essential for debugging containerized apps  
- Infrastructure misconfiguration can appear as application failure  
