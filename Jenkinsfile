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

        stage('verify') {
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
        stage('sonar-analysis') {
                            steps {
                                echo 'Sonar ...'
                                sh 'mvn sonar:sonar -Dsonar.projectKey=springboot-local -Dsonar.host.url=http://localhost:9000 -Dsonar.login=squ_442d782f60d597d942377b5e15c34fa69d5b44fd'
                            }
                        }

    }

}