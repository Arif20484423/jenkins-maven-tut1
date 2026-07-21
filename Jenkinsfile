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

        stage('Run') {
                    steps {
                        echo 'Running tests...'
                        sh 'java -jar target/jenkins-maven-tut1-1.0-SNAPSHOT.jar'
                    }
                }

    }

}