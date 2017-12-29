pipelineJob('build-beta') {
  def repo = "https://github.com/jhandguy/${platform}-ci-pipeline"

  description("Beta build for platform ${platform}")

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('master', '**/feature*')
          scriptPath('build-beta/Jenkinsfile')
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
