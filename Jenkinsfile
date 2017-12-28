node {
  stage('Checkout') {
    jobDsl targets: ['jobs/seed-build-qa.groovy', 'jobs/seed-build-beta.groovy'].join('\n')
  }

  stage('Seed') {
    jobDsl targets: ['jobs/seed-build-qa.groovy', 'jobs/seed-build-beta.groovy'].join('\n')
  }
}
