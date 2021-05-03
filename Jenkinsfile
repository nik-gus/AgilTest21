pipeline {
    environment {
        
            PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Tools\\Java\\jdk-15.0.2\\bin"
            //PATH="/usr/local/bin;/usr/local/Cellar/openjdk/15.0.2/libexec/openjdk.jdk/Contents/Home/"

    }
    agent {label 'win'}
        //node { 
            //label 'mac'
        //}
    
    tools {
        maven 'M3'
    }
    
    options {timestamps()}
    
    stages {
        stage ('Build') {
           steps {
                bat 'mvn -Dmaven.test.failure.ignore=true clean install'
                bat 'exit 0'
                //bat 'mvn clean install -DWebDriver=Firefox'
                //sh 'mvn clean install'
           }
        }
        
        stage('test') {
            steps {
                echo 'testing the application...'
                bat "mvn -Dmaven.test.failure.ignore=true test"
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE'){
                    bat "exit 1"
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
                /*success {
                    junit 'target/surefire-reports/**/*.xml'*/
                unstable {
                    echo 'This will run only if the run was unstable'
                }
                changed {
                    echo 'This will run only if the state of the pipeline has changed'
                }
            }
        }
        stage ('Run Jmeter tests') {
            steps {
                bat 'exit 0'
                parallel (TestLOGIN: {
                    script {
                         bat 'C:\\Tools\\apache-jmeter-5.4.1\\bin\\jmeter.bat -Jjmeter.save.saveservice.output_format=xml -n -t C:\\Tools\\apache-jmeter-5.4.1\\bin\\PrestaShop_LOGIN.jmx -l jmeter_PSreportLOGIN.jtl'
                         perfReport 'jmeter_report.jtl'
                    }
                }, TestART: {
                    script {
                        bat 'C:\\Tools\\apache-jmeter-5.4.1\\bin\\jmeter.bat -Jjmeter.save.saveservice.output_format=xml -n -t C:\\Tools\\apache-jmeter-5.4.1\\bin\\PrestaShop_ART.jmx -l jmeter_PSreportART.jtl'
                         perfReport 'jmeter_report.jtl'
                    } 
                }            
            }
        }
    }
}
