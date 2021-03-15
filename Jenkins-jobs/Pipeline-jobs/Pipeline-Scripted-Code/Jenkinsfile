 stage('Build') {
    echo "start building"
}

stage('Test') {
    parallel linux: {
        node('master') {
            checkout scm
            try {
                 
               echo "Run on Linux slave"
            }
            finally {
                 echo "Finally Run on Linux slave"
            }
        }
    },
    windows: {
        node('master') {
            echo "Run on Windows Master"
        }
    }
}

