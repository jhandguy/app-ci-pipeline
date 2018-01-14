def seedJobsFor(platform) {
  dir ("${platform}") {
    git url: "https://github.com/jhandguy/${platform}-ci-pipeline.git", branch: 'generic'
    sh 'cp -r pipelines ../pipelines'
  }

  jobDsl targets: ['jobs/*.groovy'].join('\n'),
         sandbox: true,
         additionalParameters: [platform: "${platform}"]
}

pipeline {
  agent any

  stages {
    stage('Seed Android Jobs') {
      steps {
        seedJobsFor('android')
      }
    }
    stage('Seed iOS Jobs') {
      steps {
        seedJobsFor('ios')
      }
    }
  }
}
