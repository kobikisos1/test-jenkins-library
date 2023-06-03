import groovy.json.JsonSlurper


def call(Map config) {
    node('docker') {
        stage('Checkout') {
            echo "Checkout"
        }
    }
}
