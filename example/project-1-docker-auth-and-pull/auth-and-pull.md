## Docker Authentication  
Instead of using a password, Docker recommends using a Personal Access Token (PAT).  

### What is a Docker Hub Personal Access Token (PAT)?  
- A secure alternative to Docker Hub password  
- Can be scoped and revoked  
- Safer for CLI usage and automation

### How to generate a Personal Access Token (Docker Hub)
1. Go to https://hub.docker.com  
2. Sign in to your account  
3. Click on Profile → Account Setting  
4. Click Personal Access Token  
5. Give it a name (example: docker-cli-access)  
6. Copy the token

### Login to Docker Hub using PAT (CLI)

Run the following command in your terminal:
```bash
docker login
```

You will be prompted for:
```bash
Username: <your-dockerhub-username>
Password: <PASTE YOUR PERSONAL ACCESS TOKEN>
```

Paste the PAT, Docker treats the PAT as the password

Verify Login
```bash
Login Succeeded
```
---
Pull an Image from Docker Hub

```bash
docker pull nginx
docker pull mysql
```
Verify the downloaded image:
```bash
docker images
```

Run a Container from the Pulled Image
```bash
docker run -d -p 8080:80 nginx
docker run -e MYSQL_ROOT_PASSWORD=root mysql
```
