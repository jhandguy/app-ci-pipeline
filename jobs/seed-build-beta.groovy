pipelineJob('build-beta') {
    definition {
        cps {
            script(readFileFromWorkspace('build-beta.groovy'))
            sandbox()
        }
    }
}
