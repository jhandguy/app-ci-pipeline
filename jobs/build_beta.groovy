pipelineJob("${platform}-build-beta") {
  description("Beta build for platform ${platform}")

  triggers {
    cron('* * * * *')
  }

  definition {
    cps {
      script(readFileFromWorkspace('pipelines/build_beta.groovy'))
      sandbox()
    }
  }
}
