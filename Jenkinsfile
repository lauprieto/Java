pipeline {
    agent { label 'agent2' }

    stages {
        stage('Checkout') {
            steps {
                // Clona el repositorio
                git 'https://github.com/lauprieto/Java.git'
            }
        }

        stage('Build') {
            steps {
                // Limpia y construye el proyecto (esto ya incluye empaquetado y tests)
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Ejecuta los tests (opcional si ya se ejecutaron con 'package')
                bat 'mvn test'
            }
        }
    }
}
