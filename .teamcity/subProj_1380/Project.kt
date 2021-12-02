package subProj_1380

import subProj_1380.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1380")
    name = "subProj 1380"

    buildType(subProj_bt_1380_0)
    buildType(subProj_bt_1380_1)
    buildType(subProj_bt_1380_2)
    buildType(subProj_bt_1380_3)
    buildType(subProj_bt_1380_4)
    buildType(subProj_bt_1380_5)
})
