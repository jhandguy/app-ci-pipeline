def seedJobsFor(platform) {
  dir ("${platform}") {
    git url: "https://github.com/jhandguy/${platform}-ci-pipeline.git"
    sh 'cp -r pipelines ../pipelines'
  }

  jobDsl targets: ['jobs/*.groovy'].join('\n'),
         sandbox: true,
         additionalParameters: [platform: "${platform}"]
}

pipeline {
  agent any

  stages {
    stage('Seed Jobs') {
      steps {
        seedJobsFor('android')
        seedJobsFor('ios')
      }
    }
  }
}
