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
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
