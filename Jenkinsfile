def seedJobsFor(platform) {
  dir ("${platform}") {
    git url: "https://github.com/jhandguy/${platform}-ci-pipeline.git"
    sh 'cp -r pipelines ../pipelines'
  }

  jobDsl targets: ['jobs/*.groovy'].join('\n'),
         sandbox: true,
         additionalParameters: [platform: "${platform}"]
}

def buildJobsFor(platform) {
  build job: "${platform}-build-qa"
  build job: "${platform}-build-beta"
}

pipeline {
  agent any

  stages {
    stage('Seed Jobs') {
      parallel {
        stage('Seed Android Jobs') {
          steps {
            seedJobsFor('android')
          }
        }
        stage('See iOS Jobs') {
          steps {
            seedJobsFor('ios')
          }
        }
      }
    }
    stage('Build Jobs') {
      parallel {
        stage('Build Android Jobs') {
          steps {
            buildJobsFor('android')
          }
        }
        stage('Build iOS Jobs') {
          steps {
            buildJobsFor('ios')
          }
        }
      }
    }
  }
}
