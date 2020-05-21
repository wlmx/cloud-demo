job "test-caller-service" {
 datacenters = ["dc1"]
 type = "service"
 group "services" {
  count = 2
  task "test" {
   driver = "raw_exec"
   config {
    command  = "java"
    args = ["-jar", "/home/user/test-caller-service-0.0.1-SNAPSHOT.jar"]
   }
   resources {
    cpu = 300
    memory = 300
    network {
     port "http" {}
    }
   }
   service {
    name = "test-caller-service-nomad"
    port = "http"
   }
  }
  restart {
   attempts = 1
  }
 }
}