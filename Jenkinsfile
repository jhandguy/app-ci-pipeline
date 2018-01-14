pipeline {
  agent any

  stages {
    stage('Seed iOS Jobs') {
      steps {

        dir ('ios') {
          git url: 'https://github.com/jhandguy/ios-ci-pipeline.git', branch: 'generic'

          jobDsl targets: ['../jobs/*.groovy'].join('\n'),
                 sandbox: true,
                 additionalParameters: [platform: 'ios']
        }

        dir ('android') {
          git url: 'https://github.com/jhandguy/android-ci-pipeline.git', branch: 'generic'

          jobDsl targets: ['../jobs/*.groovy'].join('\n'),
                 sandbox: true,
                 additionalParameters: [platform: 'android']
        }
      }
    }
  }
}
