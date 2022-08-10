sudo apt install maven -y
sudo mvn -DskipTests=true  clean package
sudo apt install docker.io docker-compose -y
sudo apt update
sudo docker build -t springboottestimg .
sudo docker-compose up -d
sudo docker ps -a
