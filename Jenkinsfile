pipeline{
	agent all
	tools{
		maven 'MAVEN3'
		jdk 'OracleJDK8'
	}
	stages{
		stage('Adding the repo'){
			step('Adding the repo'){
			git branch: 'vp-repo' url:'https://github.com/devopshydclub/vprofile-repo.git'
			}
	}
		stage('Build'){
			step{
				sh 'mvn clean install -Dskiptests'
		
		}
	}
	
	}
}