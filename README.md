sudo consul agent -dev -client 0.0.0.0
sudo nomad agent -dev -bind=0.0.0.0 -consul-address=0.0.0.0:8500
sh h2.sh -web -webAllowOthers -tcp -tcpAllowOthers -webPort 8123 -tcpPort 9123


GET http://192.168.88.250:31152/auth-service/oauth/check_token?token=7b3279d3-6bb9-4418-94cd-8a2de27df893
Authorization: Basic client password
accept: */*

###


POST http://192.168.88.250:31152/auth-service/oauth/token
Authorization: Basic client password
Content-Type: application/x-www-form-urlencoded

grant_type=password&username=admin&password=secret

###

POST http://192.168.88.250:31152/auth-service/oauth/token
Authorization: Basic client password
Content-Type: application/x-www-form-urlencoded

grant_type=refresh_token&refresh_token=db7441ac-ba3d-4787-a35f-0b9c21791ef6

###