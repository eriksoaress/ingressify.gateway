pipeline {
    agent any
    stages {

        stage('Build Auth') {
            steps {
                build job: 'jogayjoga-auth-resource', wait: true
            }
        }

        stage('Build') { 
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Image') {
            steps {
                script {
                    gateway = docker.build("eriksoaress/gateway:${env.BUILD_ID}", "-f Dockerfile .")
                }
            }
        }

        stage('Push Image') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credential') {
                        gateway.push("${env.BUILD_ID}")
                        gateway.push("latest")
                    }
                }
            }
        }
    }
}