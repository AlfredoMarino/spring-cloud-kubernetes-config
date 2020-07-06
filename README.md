# Spring-cloud-kubernetes-config

Sample spring project that prints in the log the value of the environment variable welcome.message every three seconds and the endpoint / welcome prints the message variable value, both from a configmap


in your kubernetes cluster clone this repository and then run the following commands:
    
    cd spring-cloud-kubernetes-config
    kubectl apply -f config.yaml
    kubectl apply -f rbac.yaml
    kubectl apply -f deploy.yaml
    
To see the logs:
    
    kubectl logs pod/{pod-name}
    
Request to the endpoint:

    curl {url}/welcome
    