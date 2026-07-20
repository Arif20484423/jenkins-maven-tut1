pipeline {
    agent any

    stages {
//         stage('Checkout') {
//             steps {
//                 echo 'Checking out source code...'
//                 checkout scm
//             }
//         }

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

//         stage('Deploy') {
//             steps {
//                 echo 'Deploying application...'
//                 sh './deploy.sh'
//             }
//         }
    }

//     post {
//         always {
//             echo 'Pipeline execution completed.'
//         }
//         success {
//             echo 'Build was successful!'
//         }
//         failure {
//             echo 'Build failed.'
//         }
//     }
}