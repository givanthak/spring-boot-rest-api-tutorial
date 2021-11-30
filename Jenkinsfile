pipeline {
   agent any
      environment {
	AWS_ACCESS_KEY_ID = credentials('AWS_ACCESS_KEY_ID')
	AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
      }
      stages {

		stage ('Build Docker Image') {
		   steps {
	              sh '''
		        sudo aws ecr get-login --region us-east-1 --no-include-email | xargs -n 1 -P 10 -I {} bash -c {}
			    sudo docker build -t 609474515704.dkr.ecr.us-east-1.amazonaws.com/springbootapp:latest .
			    sudo docker push 609474515704.dkr.ecr.us-east-1.amazonaws.com/springbootapp:latest
		       '''
            }
		}
        stage ('Deploy docker image to K8s') {
		   steps {
	              sh '''
		          aws eks update-kubeconfig --name test-dev-eks --region us-east-1
                  helm upgrade --install test-dev springbootapp
		       '''
            }
		}

		}
	}