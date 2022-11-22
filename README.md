# 

## Model
www.msaez.io/#/storming/Jxr4OOAGRAbozsXxjH2xiURXUDg2/b5ca6fc13d81c9ef5ba6d3df6948b279

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- front
- store
- delivery
- customer
- review


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- front
```
 http :8088/oders id="id" foodId="foodId" customerId="customerId" options="options" address="address" status="status" 
 http :8088/payments id="id" orderId="orderId" 
```
- store
```
 http :8088/storedOrders id="id" foodId="foodId" orderdId="orderdId" options="options" cusomerId="cusomerId" status="status" storeAddress="storeAddress" 
```
- delivery
```
 http :8088/deliveries id="id" orderId="orderId" storeAddress="storeAddress" customerAddress="customerAddress" 
```
- customer
```
 http :8088/notificationLogs id="id" customerId="customerId" message="message" 
```
- review
```
 http :8088/reviews id="id" orderId="orderId" review="review" point="point" date="date" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

