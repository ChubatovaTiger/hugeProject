package subProj_380

import subProj_380.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_380")
    name = "subProj 380"

    buildType(subProj_bt_380_0)
    buildType(subProj_bt_380_5)
    buildType(subProj_bt_380_2)
    buildType(subProj_bt_380_1)
    buildType(subProj_bt_380_4)
    buildType(subProj_bt_380_3)
})
