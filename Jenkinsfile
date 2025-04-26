pipeline {
    agent any

    stages {
        stage('Descargar código') {
            steps {
                git url: 'https://github.com/lauprieto/Java.git'
            }
        }

        stage('Ejecutar pruebas') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build con agent2') {
            agent { label 'agent2' }
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
