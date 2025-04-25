pipeline {
    agent { label 'agent2' }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/lauprieto/Java.git'
            }
        }
        
        stage('Build') {
            steps {
                // Ejecutar el comando de Maven para limpiar y compilar el proyecto
                bat 'mvn clean install'

                // Si el comando de build ya incluye el paquete, no es necesario el siguiente paso.
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Ejecutar los tests de Maven
                bat 'mvn test'
            }
        }
    }
}
