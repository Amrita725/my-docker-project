## What is a Dockerfile?

A Dockerfile is a text file that contains a set of instructions used to build a Docker image. Each instruction in a Dockerfile creates a layer in the final image.

With a Dockerfile:  
-Environment becomes reproducible  
-Application becomes portable  
-Builds are automated  
-Infrastructure becomes version-controlled  

```
Dockerfile → docker build → Image → docker run → Container
```
Dockerfile: Instructions  
Image: Read-only template  
Container: Running instance of the image  

---

### Basic Structure of a Dockerfile

A simple Dockerfile usually looks like this:
```
FROM base-image
WORKDIR /app
COPY files
RUN commands
CMD or ENTRYPOINT
```
### How Docker Builds Images (Behind the Scenes)

- Each instruction = one layer
- Layers are cached
- If a layer doesn’t change → Docker reuses it

--- 

## Common Dockerfile Instructions (Step-by-Step)

#### 1️. FROM
```
FROM node:18-alpine
```

What it does: Defines the base image. This is the starting point of your image

#### 2. WORKDIR
```
WORKDIR /app
```

What it does: Sets the working directory inside the container and all following commands run inside this directory.


#### 3. COPY
```
COPY . .
or
COPY <source> <destination>
```

What it does: Copies files from host machine → container


#### 4. RUN
```
RUN npm install
```

What it does: Executes commands at build time. Creates a new image layer
It is used for: Installing dependencies, Updating OS packages, Building application code

#### 5. CMD
```
CMD ["node", "app.js"]
```

What it does: Defines the default command to run when the container starts.

Key points: Only one CMD is allowed. Can be overridden at runtime


#### 6. ENTRYPOINT
```
ENTRYPOINT ["node", "app.js"]
```

What it does: Defines the main executable. Harder to override than CMD

#### 7. EXPOSE
```
EXPOSE 3000
```

What it does: Documents which port the app listens on

#### 8️. ENV
```
ENV NODE_ENV=production
```

What it does: Sets environment variables inside the container

#### 9. USER (Security Best Practice)
```
USER node
```
What it does: Runs the container as a non-root user and improves security
