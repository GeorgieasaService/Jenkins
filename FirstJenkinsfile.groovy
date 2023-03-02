pipeline {
    agent any
    tools {
        maven 'MAVEN3'
        jdk 'OracleJDK8'
    }
    stages {
        stage('fetching the repo'){
            step{
                git branch: 'vp-rem' url:'https://github.com/devopshydclub/vprofile-repo.git'
            }
        }
        stage('Build'){
            step{
                sh 'mvn install -DskipTests'
               }
            post{
                success {
                    echo 'Now Archiving the artifacts'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        stage('unit test')
            steps{
                sh 'mvn test'
            }
        }

    }
}