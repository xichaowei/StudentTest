pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
 		sh  'mvn clean install'
            }
	    post{
                success{
                    echo 'Now Archiving ....'
 
                    archiveArtifacts artifacts : '**/*.jar'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
