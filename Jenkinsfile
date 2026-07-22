pipeline {
    agent any

    tools {
      maven 'jenkins-maven'
    }

    stages {
        stage("docker-build"){
            steps{
                sh "docker build -t arif2048/app:${BUILD_NUMBER} ."
            }
        }
        stage('push-to-docker'){
            steps{
                 withCredentials([usernamePassword(
                                            credentialsId: 'docker-creds',
                                            usernameVariable: 'DOCKER_USER',
                                            passwordVariable: 'DOCKER_PASS'
                                        )]) {
                                            sh "docker login -u $DOCKER_USER -p $DOCKER_PASS"

                                        }
            }
        }
        stage('docker-login'){
                    steps{
                        sh 'docker push arif2048/app:${BUILD_NUMBER}'
                    }
                }



//         stage('Build') {
//             steps {
//                 echo 'Building application...'
//                 sh 'mvn clean compile'
//             }
//         }
//
//         stage('Test') {
//             steps {
//                 echo 'Running tests...'
//                 sh 'mvn test'
//             }
//             post{
//                 always{
//                     junit 'target/surefire-reports/*.xml'
//
//                 }
//             }
//         }
//
//
//         stage('Package') {
//                     steps {
//                         echo 'Running tests...'
//                         sh 'mvn package'
//                     }
//                 }
//
//         stage('verify') {
//                     steps {
//                         echo 'Running tests...'
//                         sh 'mvn verify '
//                     }
//                     post{
//                                     always{
//
//                                         recordCoverage(tools: [[pattern: 'target/site/jacoco/jacoco.xml']])
//                                     }
//                                 }
//                 }
//         stage('sonar-analysis') {
//                             steps {
//                                 echo 'Sonar ...'
//                                 withSonarQubeEnv("Sonar-Local") {
//                                     sh "mvn sonar:sonar -Dsonar.projectKey=springboot-local"
//                                 }
//                             }
//                         }
//
//
//
//          stage('quality-gate') {
//                                     steps {
//                                          echo 'Quality gate'
//                                          timeout(15) {
//                                              waitForQualityGate true
//                                          }
//                                      }
//                                  }
//
//               stage('run') {
//                                                   steps {
//                                                       echo 'Run'
//                                                       sh "java -jar target/jenkins-maven-tut1-1.0-SNAPSHOT.jar"
//                                                   }
//                                               }

    }

}