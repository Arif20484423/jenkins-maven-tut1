pipeline {
    agent any

    tools {
      maven 'jenkins-maven'
    }


    stages {

        stage('Build') {
            steps {
                echo 'Building application...'
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

    }

}