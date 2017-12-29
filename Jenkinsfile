node {
  jobDsl targets: ['jobs/*.groovy'].join('\n'),
         removedJobAction: 'DELETE',
         removedViewAction: 'DELETE',
         lookupStrategy: 'SEED_JOB',
         sandbox: true,
         additionalParameters: [platform: 'android']
}
