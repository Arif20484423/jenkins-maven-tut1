pipeline {
    agent any

    tools {
      maven 'jenkins-maven'
    }


    stages {

        stage('Build') {
            steps {
                echo 'Building application...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
            post{
                always{
                    junit 'target/surefire-reports/*.xml'

                }
            }
        }


        stage('Package') {
                    steps {
                        echo 'Running tests...'
                        sh 'mvn package'
                    }
                }

        stage('Run') {
                    steps {
                        echo 'Running tests...'
                        sh 'mvn verify '
                    }
                    post{
                                    always{

                                        recordCoverage(tools: [[pattern: 'target/site/jacoco/jacoco.xml']])
                                    }
                                }
                }

    }

}