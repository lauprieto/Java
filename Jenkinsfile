pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/lauprieto/Java.git'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew build' 
            }
        }

        stage('Run Tests') {
            steps {
                sh './gradlew test' 
            }
        }
    }
}
