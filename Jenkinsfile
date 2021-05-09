pipeline {
    environment {
            PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Tools\\Java\\jdk-15.0.2\\bin"
    }
    agent {
            label 'win'
        }
    
    tools {
        maven 'M3'
    }
    
    //options {timestamps()}
    
    stages {
        stage('Build - Chrome') {
            steps {
                bat 'mvn clean install -DWebDriver=Chrome -Dmaven.test.failure.ignore=true'
            }
        }
        stage('Build - Firefox') {
            steps {
                bat 'mvn clean install -DWebDriver=Firefox -Dmaven.test.failure.ignore=true'
            }
        }

        stage('Run Jmeter tests') {
            steps {
                bat 'C:\\Tools\\apache-jmeter-5.4.1\\bin\\jmeter.bat -Jjmeter.save.saveservice.output_format=xml -n -t C:\\Tools\\apache-jmeter-5.4.1\\bin\\PerformanceTest\\Project_PrestaShop.jmx -l jmeter_PSreport.jtl'
                perfReport 'jmeter_report.jtl'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            junit '**/target/surefire-reports/TEST-*.xml'
        }
        success {
            echo 'This will run only if successful'      
        }
        unstable {
            echo 'This will run only if the run was unstable'
        }
        changed {
            echo 'This will run only if the state of the pipeline has changed'
        }
    }
}
