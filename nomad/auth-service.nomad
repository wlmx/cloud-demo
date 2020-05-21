job "auth-service" {
 datacenters = ["dc1"]
 type = "service"
 group "services" {
  count = 1
  task "auth" {
   driver = "raw_exec"
   config {
    command  = "java"
    args = ["-jar", "/home/user/auth-service-0.0.1-SNAPSHOT.jar"]
   }
   resources {
    cpu = 300
    memory = 300
    network {
     port "http" {}
    }
   }
   service {
    name = "auth-service-nomad"
    port = "http"
   }
  }
  restart {
   attempts = 1
  }
 }
}