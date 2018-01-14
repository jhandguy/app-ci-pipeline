pipeline {
  agent any

  stages {
    stage('Seed Android Jobs') {
      steps {
        dir ('android') {
          git url: 'https://github.com/jhandguy/android-ci-pipeline.git', branch: 'generic'

          jobDsl targets: ['jobs/*.groovy'].join('\n'),
                 sandbox: true,
                 additionalParameters: [platform: 'android']
        }
      }
    }
  }
}
