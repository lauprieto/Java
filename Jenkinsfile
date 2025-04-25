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
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
