package com.github.mydogtom.talaiot

import com.cdsap.talaiot.metrics.base.GradleMetric

class ProjectFolderMetric : GradleMetric<String>(
    provider = { it.rootDir.absolutePath },
    assigner = { report, value -> report.customProperties.buildProperties["projectFolder"] = value }

)