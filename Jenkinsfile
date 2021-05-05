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
        stage ('Build - Chrome') {
            steps {
                    bat 'mvn clean install -Dtest=CheckOutAndPayTest -DWebDriver=Chrome'
            }
        }
        stage ('Build - Firefox') {
            steps {
                    bat 'mvn clean install -Dtest=CheckOutAndPayTest -DWebDriver=Firefox'
            }
        }

//           post {
//               success {
//                   junit 'target/surefire-reports/**/*.xml'
//               }
//           }
        stage ('Run Jmeter tests') {
            steps {
                bat 'C:\\Tools\\apache-jmeter-5.4.1\\bin\\jmeter.bat -Jjmeter.save.saveservice.output_format=xml -n -t C:\\Tools\\apache-jmeter-5.4.1\\bin\\PrestaShop_LOGIN.jmx -l jmeter_PSreportLOGIN.jtl'
                perfReport 'jmeter_report.jtl'
            }
        }
     }
 }
