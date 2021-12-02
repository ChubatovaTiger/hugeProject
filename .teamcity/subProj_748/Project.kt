package subProj_748

import subProj_748.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_748")
    name = "subProj 748"

    buildType(subProj_bt_748_5)
    buildType(subProj_bt_748_1)
    buildType(subProj_bt_748_2)
    buildType(subProj_bt_748_3)
    buildType(subProj_bt_748_4)
    buildType(subProj_bt_748_0)
})
