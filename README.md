# freelance_platform_job_microservice

## Docker build instructions

### Create a docker network if it doesn't exist
```bash
docker network create freelance-platform
```

### Build the docker image
```bash
docker build -t job-service .
```

### Run the docker image
```bash
docker run -p 9091:8080 --name job-service --network freelance-platform job-service
```

### Test the service
```bash
curl http://localhost:9090/jobs/hello
```

