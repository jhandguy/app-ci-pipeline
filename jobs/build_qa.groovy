pipelineJob('build-qa') {
  description("QA build for platform ${platform}")

  definition {
    cpsScm {
      scm {
        git {
          remote { url("https://github.com/jhandguy/${platform}-ci-pipeline") }
          branches('master', '**/feature*')
          scriptPath('build-qa/Jenkinsfile')
          extensions { }  // required as otherwise it may try to tag the repo, which you may not want
        }

        // the single line below also works, but it
        // only covers the 'master' branch and may not give you
        // enough control.
        // git(repo, 'master', { node -> node / 'extensions' << '' } )
      }
    }
  }
}
